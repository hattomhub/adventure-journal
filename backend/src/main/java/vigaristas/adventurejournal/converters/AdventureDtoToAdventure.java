package vigaristas.adventurejournal.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vigaristas.adventurejournal.command.AdventureDto;
import vigaristas.adventurejournal.persistence.model.Adventure;
import vigaristas.adventurejournal.services.AdventureService;

@Component
public class AdventureDtoToAdventure extends AbstractConverter<AdventureDto, Adventure >{

    private AdventureService adventureService;

    @Autowired
    public void setAdventureService(AdventureService adventureService) {
        this.adventureService = adventureService;
    }

    @Override
    public Adventure convert(AdventureDto adventureDto) {

        Adventure adventure = (adventureDto.getId() != null ? adventureService.get(adventureDto.getId()) : new Adventure());

        adventure.setTitle(adventureDto.getTitle());
        adventure.setsDesc(adventureDto.getsDisc());
        adventure.setLocation(adventureDto.getLocation());
        adventure.setImgUrl(adventureDto.getImgUrl());
        adventure.setScore(adventureDto.getScore());
        adventure.setAdventureType(adventureDto.getAdventureType());

        return null;
    }
}
