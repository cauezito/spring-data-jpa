package br.com.cauezito.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cauezito.spring.model.Telefone;

@Repository
public interface InterfaceSpringDataTelefone extends CrudRepository<Telefone, Long> {

}
