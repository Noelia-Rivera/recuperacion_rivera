package pe.com.coches.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.com.coches.dao.CocheDao;
import pe.com.coches.entity.Coche;
import pe.com.coches.repository.CocheRepository;

@Component
public class CocheDaoImpl implements CocheDao{
	@Autowired
	private CocheRepository repository;
	
	@Override
	public Coche create(Coche co) {
		// TODO Auto-generated method stub
		return repository.save(co);
	}

	@Override
	public Coche update(Coche co) {
		// TODO Auto-generated method stub
		return repository.save(co);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Coche> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Coche> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
