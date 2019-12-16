package vigaristas.adventurejournal.converters;

import org.springframework.stereotype.Component;
import vigaristas.adventurejournal.command.AdventureDto;
import vigaristas.adventurejournal.persistence.model.Adventure;

@Component
public class AdventureToAdventureDto extends AbstractConverter<Adventure, AdventureDto> {

    @Override
    public AdventureDto convert(Adventure adventure) {

        AdventureDto adventureDto = new AdventureDto();

        adventureDto.setTitle(adventure.getTitle());
        adventureDto.setsDisc(adventure.getsDesc());
        adventureDto.setCreationTime(adventure.getCreationTime());
        adventureDto.setType(adventure.getType());
        adventureDto.setImgUrl(adventure.getImgUrl());
        adventureDto.setLocation(adventure.getLocation());
        adventureDto.setScore(adventure.getScore());

        return adventureDto;
    }
}
