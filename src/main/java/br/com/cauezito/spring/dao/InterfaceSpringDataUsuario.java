package br.com.cauezito.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cauezito.spring.model.Usuario;

@Repository
public interface InterfaceSpringDataUsuario extends CrudRepository<Usuario, Long> {
	
	@Query(value = "select u from Usuario u where u.nome like %?1%")
	public List<Usuario> buscaPorNome(String nome);
}
