package course.maqlucoursetodo.repositories;

import course.maqlucoursetodo.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoitemRepository extends JpaRepository<TodoItem,Long> {

}
