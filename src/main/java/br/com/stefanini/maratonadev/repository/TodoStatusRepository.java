package br.com.stefanini.maratonadev.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.stefanini.maratonadev.model.Todo;
import br.com.stefanini.maratonadev.model.TodoStatus;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;

@ApplicationScoped
public class TodoStatusRepository implements PanacheRepository<TodoStatus> {

	public List<TodoStatus> orderByData(Long id) {
		return TodoStatus
				.list("todo", Sort.by("data").descending(),new Todo(id));
	}
	
}
