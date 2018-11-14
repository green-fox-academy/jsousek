package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ActiveList  {

    @Autowired
    ToDoInterface serviceClass;

    public List<ToDo> listActive(){
        List<ToDo> toReturn = serviceClass.findAll().stream()
                .filter(todo -> (todo.isDone()))
                .collect(Collectors.toList());
        return toReturn;
    }
}
