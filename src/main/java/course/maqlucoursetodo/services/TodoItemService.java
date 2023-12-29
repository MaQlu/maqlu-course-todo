package course.maqlucoursetodo.services;

import course.maqlucoursetodo.models.TodoItem;
import course.maqlucoursetodo.repositories.TodoitemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class TodoItemService {

    @Autowired
    private TodoitemRepository todoitemRepository;

    public Iterable<TodoItem> getAll(){
        return todoitemRepository.findAll();
    }

    public Optional<TodoItem> getById(Long id){
        return todoitemRepository.findById(id);
    }

    public TodoItem save(TodoItem todoItem){
        if(todoItem.getId()== null){
            todoItem.setCreatedAt(Instant.now());
        }
        todoItem.setUpdatedAt(Instant.now());
        return todoitemRepository.save(todoItem);
    }

    public void delete(TodoItem todoItem){
        todoitemRepository.delete(todoItem);
    }
}
