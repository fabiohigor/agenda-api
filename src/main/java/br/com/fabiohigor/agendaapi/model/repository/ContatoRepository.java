package br.com.fabiohigor.agendaapi.model.repository;

import br.com.fabiohigor.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
