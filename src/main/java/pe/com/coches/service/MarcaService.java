package pe.com.coches.service;

import java.util.List;
import java.util.Optional;

import pe.com.coches.entity.Marca;

public interface MarcaService {
	Marca create(Marca ma);
	Marca update(Marca ma);
	void delete(Long id);
	Optional<Marca> read(Long id);
	List<Marca> readAll();
}
