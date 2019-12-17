package vigaristas.adventurejournal.services;

import vigaristas.adventurejournal.persistence.model.Adventure;

import java.util.List;

public interface AdventureService {

    Adventure get(Integer id);

    List<Adventure> getList();

    Adventure save(Adventure adventure);
}
