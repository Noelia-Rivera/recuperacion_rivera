package pe.com.coches.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.com.coches.dao.MarcaDao;
import pe.com.coches.entity.Marca;
import pe.com.coches.repository.MarcaRepository;

@Component
public class MarcaDaoImpl implements MarcaDao{
	@Autowired
	private MarcaRepository repository;
	
	@Override
	public Marca create(Marca ma) {
		// TODO Auto-generated method stub
		return repository.save(ma);
	}

	@Override
	public Marca update(Marca ma) {
		// TODO Auto-generated method stub
		return repository.save(ma);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Marca> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Marca> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
