package base_project.project_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import base_project.project_demo.model.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
