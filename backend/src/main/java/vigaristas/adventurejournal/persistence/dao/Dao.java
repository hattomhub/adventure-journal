package vigaristas.adventurejournal.persistence.dao;

import vigaristas.adventurejournal.persistence.model.Model;

import java.util.List;

public interface Dao<T extends Model> {

    List<T> findAll();

    T findBy(Integer id);

    T saveOrUpdate(T modelObject);

    void delete (Integer id);
}
