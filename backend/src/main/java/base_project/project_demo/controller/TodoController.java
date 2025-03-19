package base_project.project_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import base_project.project_demo.model.entity.Todo;
import base_project.project_demo.service.TodoService;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Todo> getTodos() {
        return todoService.getTodos(); // Return the static todos list
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Todo addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
        return todo;
    }

}
