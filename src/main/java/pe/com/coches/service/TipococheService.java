package pe.com.coches.service;

import java.util.List;
import java.util.Optional;

import pe.com.coches.entity.Tipocoche;

public interface TipococheService {
	Tipocoche create(Tipocoche ti);
	Tipocoche update(Tipocoche ti);
	void delete(Long id);
	Optional<Tipocoche> read(Long id);
	List<Tipocoche> readAll();
}
