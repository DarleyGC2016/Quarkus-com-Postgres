package br.com.stefanini.maratonadev.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import br.com.stefanini.maratonadev.model.User;
import br.com.stefanini.maratonadev.repository.UserRepository;

@RequestScoped
public class UserDao {
	
	@Inject
	UserRepository ur;
	
	public User buscarUsuarioPorEmail(String email) {	
		return ur.find("email", email).firstResult();
	}
	
	public User buscarPorPermissao(String permissao) {
		return ur.find("permissao", permissao).firstResult();
	}
	
}
