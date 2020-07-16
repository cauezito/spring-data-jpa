package br.com.cauezito.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.cauezito.spring.dao.InterfaceSpringDataUsuario;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring-config.xml"})
public class AppTest {

	@Autowired
	private InterfaceSpringDataUsuario isdu;
	
	@Test
	public void insert() {
		System.out.println("Iniciou");
	}

}
