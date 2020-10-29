package br.com.stefanini.maratonadev.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.eclipse.microprofile.opentracing.Traced;

import br.com.stefanini.maratonadev.model.Todo;
import br.com.stefanini.maratonadev.repository.TodoRepository;



@RequestScoped
@Traced
public class TodoDao {


	@Inject
	TodoRepository tr;
	@Transactional
	/**
	 * Inseri um TODO e retorna o ID criado
	 * @param todo
	 * @return
	 */
	public Long inserir(Todo todo) {
		todo.persistAndFlush();
		return todo.getId();
	}
	
	@Transactional
	public void atualizar(Todo todo) {
		tr.persist(todo);
	}
		
	public List<Todo> listar(){
		return tr.listAll();
	}
	
	@Transactional
	public void excluir(Long id) {

		tr.deleteById(id);
		
	}
	
	public Boolean isnomeRepetido(String nome) {		
		return tr.list("nome",nome).size()>0;
	}
	
	
	public Todo buscarPorId(Long id) {
		
		return tr.findById(id);
	}

	

}
