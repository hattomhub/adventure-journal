package vigaristas.adventurejournal.persistence.dao.jpa;

import org.springframework.stereotype.Repository;
import vigaristas.adventurejournal.persistence.dao.UserDao;
import vigaristas.adventurejournal.persistence.model.User;

@Repository
public class JpaUserDao extends GenericJpaDao<User> implements UserDao {

    public JpaUserDao() {
        super(User.class);
    }
}
