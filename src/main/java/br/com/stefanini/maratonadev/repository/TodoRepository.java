package br.com.stefanini.maratonadev.repository;

import javax.enterprise.context.ApplicationScoped;

import br.com.stefanini.maratonadev.model.Todo;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class TodoRepository implements PanacheRepositoryBase<Todo, Long>{

}
