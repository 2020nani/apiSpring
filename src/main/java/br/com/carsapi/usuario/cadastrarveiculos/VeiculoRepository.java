package br.com.carsapi.usuario.cadastrarveiculos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends CrudRepository<Veiculos, Long> {

	List<Veiculos> findByDonoCarroId(Long id);

}
