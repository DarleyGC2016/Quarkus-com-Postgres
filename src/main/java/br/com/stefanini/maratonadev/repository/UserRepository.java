package br.com.stefanini.maratonadev.repository;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import br.com.stefanini.maratonadev.model.User;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class UserRepository implements PanacheRepositoryBase<User, UUID> {

}
