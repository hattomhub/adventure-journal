package vigaristas.adventurejournal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import vigaristas.adventurejournal.command.AdventureDto;
import vigaristas.adventurejournal.converters.AdventureDtoToAdventure;
import vigaristas.adventurejournal.converters.AdventureToAdventureDto;
import vigaristas.adventurejournal.persistence.model.Adventure;
import vigaristas.adventurejournal.services.AdventureService;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/adventure")
public class RestAdventureController {

    private AdventureService adventureService;
    private AdventureToAdventureDto adventureToAdventureDto;
    private AdventureDtoToAdventure adventureDtoToAdventure;

    @Autowired
    public void setAdventureService(AdventureService adventureService) {
        this.adventureService = adventureService;
    }

    @Autowired
    public void setAdventureToAdventureDto(AdventureToAdventureDto adventureToAdventureDto) {
        this.adventureToAdventureDto = adventureToAdventureDto;
    }

    @Autowired
    public void setAdventureDtoToAdventure(AdventureDtoToAdventure adventureDtoToAdventure) {
        this.adventureDtoToAdventure = adventureDtoToAdventure;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdventureDto> showAdventure(@PathVariable Integer id) {

        Adventure adventure = adventureService.get(id);

        if (adventure == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(adventureToAdventureDto.convert(adventure), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addAdventure(@Valid @RequestBody AdventureDto adventureDto, BindingResult bindingResult, UriComponentsBuilder uriComponentsBuilder) {

        if (bindingResult.hasErrors() || adventureDto.getId() != null) {
            System.out.println("binding result has errors");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Adventure savedAdventure = adventureService.save(adventureDtoToAdventure.convert(adventureDto));

        UriComponents uriComponents = uriComponentsBuilder.path("/api/adventure/" + savedAdventure.getId()).build();

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}
