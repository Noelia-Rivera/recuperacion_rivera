package pe.com.coches.dao;

import java.util.List;
import java.util.Optional;

import pe.com.coches.entity.Marca;

public interface MarcaDao {
	Marca create(Marca ma);
	Marca update(Marca ma);
	void delete(Long id);
	Optional<Marca> read(Long id);
	List<Marca> readAll();
}
