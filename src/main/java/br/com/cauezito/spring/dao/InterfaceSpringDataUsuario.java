package br.com.cauezito.spring.dao;

import java.util.List;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cauezito.spring.model.Usuario;

@Repository
public interface InterfaceSpringDataUsuario extends CrudRepository<Usuario, Long> {
	//Retorna todos os registros que CONTÉM o nome consultado
	@Query(value = "select u from Usuario u where u.nome like %?1%")
	public List<Usuario> buscaPorNome(String nome);
	
	@Lock(LockModeType.READ)
	//Retorna o registro que possui exatamente o mesmo nome consultado
	@Query(value = "select u from Usuario u where u.nome = :nome")
	public Usuario buscaPorNomeParametro(@Param("nome") String nome);
	
	@Modifying //indica que o método fará modificações no banco
	@Transactional //para que seja possível excluir e commitar
	@Query(value = "delete from Usuario u where u.nome = ?1")
	public void deletaPorNome(String nome);
	
	@Modifying
	@Transactional
	@Query("update Usuario u set u.senha = ?1 where u.login = ?2")
	public void alteraSenha(String senha, String usuario);
}
