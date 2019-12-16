package vigaristas.adventurejournal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vigaristas.adventurejournal.persistence.dao.AdventureDao;
import vigaristas.adventurejournal.persistence.model.Adventure;

import java.util.List;

@Service
// TODO: 2019-12-16 missing profiles
public class AdventureServiceImpl implements AdventureService {

    public AdventureDao adventureDao;

    @Autowired
    public void setAdventureDao(AdventureDao adventureDao) {
        this.adventureDao = adventureDao;
    }

    @Override
    public Adventure get(Integer id) {
        return adventureDao.findBy(id);
    }

    @Override
    public List<Adventure> getList() {
        return adventureDao.findAll();
    }

    @Transactional
    @Override
    public void addAdventure(Adventure adventure) {
        adventureDao.saveOrUpdate(adventure);
    }
}
