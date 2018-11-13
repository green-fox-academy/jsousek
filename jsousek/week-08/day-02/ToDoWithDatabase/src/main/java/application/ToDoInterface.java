package application;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface ToDoInterface extends CrudRepository<ToDo, Long> {

}
