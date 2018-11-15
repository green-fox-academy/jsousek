package application;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserInterface extends CrudRepository<User, Long> {
    @Override
    List<User> findAll();
}
