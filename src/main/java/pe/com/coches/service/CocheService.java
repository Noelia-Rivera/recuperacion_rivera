package pe.com.coches.service;

import java.util.List;
import java.util.Optional;

import pe.com.coches.entity.Coche;

public interface CocheService {
	Coche create(Coche co);
	Coche update(Coche co);
	void delete(Long id);
	Optional<Coche> read(Long id);
	List<Coche> readAll();
}
