package br.com.cauezito.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.cauezito.spring.model.Usuario;

@Repository
public interface InterfaceSpringDataUsuario extends CrudRepository<Usuario, Long> {
	//Retorna todos os registros que CONTÉM o nome consultado
	@Query(value = "select u from Usuario u where u.nome like %?1%")
	public List<Usuario> buscaPorNome(String nome);
	
	//Retorna o registro que possui exatamente o mesmo nome consultado
	@Query(value = "select u from Usuario u where u.nome = :nome")
	public Usuario buscaPorNomeParametro(@Param("nome") String nome);
}
