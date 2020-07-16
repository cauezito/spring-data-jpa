package br.com.cauezito.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cauezito.spring.model.Usuario;

@Repository
public interface InterfaceSpringDataUsuario extends CrudRepository<Usuario, Long> {

}
