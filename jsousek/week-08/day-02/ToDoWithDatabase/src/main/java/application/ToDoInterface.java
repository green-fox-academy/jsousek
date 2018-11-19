package application;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface ToDoInterface extends CrudRepository<ToDo, Long> {
    @Override
    List<ToDo>findAll();

    List<ToDo>findByUserUsername(String username);

    List<ToDo> findByDoneIsFalse();

    List<ToDo> findAllByTitleContains(String search);

    /*@Query
            (value = "SELECT * FROM User  WHERE username = (String s)",
    nativeQuery = true)
    Collection<User> findAllActiveUsersNative();*/

}
