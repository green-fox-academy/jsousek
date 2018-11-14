package application;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ToDoInterface extends CrudRepository<ToDo, Long> {
    @Override
    List<ToDo>findAll();
}
