package vigaristas.adventurejournal.services;

import vigaristas.adventurejournal.persistence.model.User;

public interface UserService {

    User get (Integer id);

    User save(User user);
}
