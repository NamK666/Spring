package service;

import domain.Todo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private List<Todo> todos = new ArrayList<>();
	private Long idCounter = 1L;

	public List<Todo> getAllTodos() {
		return todos;
	}

	public void addTodo(String task) {
		todos.add(new Todo(idCounter++, task));
	}

	public void toggleTodo(Long id) {
		for (Todo todo : todos) {
			if (todo.getId().equals(id)) {
				todo.setCompleted(!todo.isCompleted());
				break;
			}
		}
	}
}
