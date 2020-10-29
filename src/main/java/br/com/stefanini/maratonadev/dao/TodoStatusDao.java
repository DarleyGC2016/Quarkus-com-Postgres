package br.com.stefanini.maratonadev.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.stefanini.maratonadev.model.Todo;
import br.com.stefanini.maratonadev.model.TodoStatus;
import br.com.stefanini.maratonadev.repository.TodoStatusRepository;
import io.quarkus.panache.common.Sort;

@RequestScoped
public class TodoStatusDao {

	@Inject
	TodoStatusRepository tsr;
	
	@Transactional
	public void inserir(TodoStatus status) {
		tsr.persist(status);
	}
	public List<TodoStatus> buscarStatusPorTarefa(Long idTarefa) {
		
		return tsr.orderByData(idTarefa);
	}
	
}
