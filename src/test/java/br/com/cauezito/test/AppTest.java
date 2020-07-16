package br.com.cauezito.test;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.cauezito.spring.dao.InterfaceSpringDataUsuario;
import br.com.cauezito.spring.model.Usuario;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring-config.xml"})
public class AppTest {

	@Autowired
	private InterfaceSpringDataUsuario springDataUsuario;
	
	@Test
	public void criarTabela() {
		System.out.println("criando tabela...");
	}
	
	@Test
	public void inserir() {
		Usuario usuario = new Usuario();
		usuario.setIdade(15);
		usuario.setLogin("cauezito");
		usuario.setSenha("123@987");
		usuario.setNome("Cauê");
		
		springDataUsuario.save(usuario);
	}
	
	@Test
	public void consultar() {
		Optional<Usuario> usuario = springDataUsuario.findById(2L);
		System.out.println(usuario.get().getNome());
	}
	
	@Test
	public void todosOsRegistros() {
		Iterable<Usuario> lista = springDataUsuario.findAll();
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.getNome());
		}
	}


}
