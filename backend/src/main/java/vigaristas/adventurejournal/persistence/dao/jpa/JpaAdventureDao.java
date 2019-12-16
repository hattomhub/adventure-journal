package vigaristas.adventurejournal.persistence.dao.jpa;

import org.springframework.stereotype.Repository;
import vigaristas.adventurejournal.persistence.dao.AdventureDao;
import vigaristas.adventurejournal.persistence.model.Adventure;

@Repository
public class JpaAdventureDao extends GenericJpaDao<Adventure> implements AdventureDao {

    public JpaAdventureDao(Class<Adventure> modelType) {
        super(modelType);
    }
}
