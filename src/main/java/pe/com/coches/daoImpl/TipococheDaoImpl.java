package pe.com.coches.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.com.coches.dao.TipococheDao;
import pe.com.coches.entity.Tipocoche;
import pe.com.coches.repository.TipococheRepository;

@Component
public class TipococheDaoImpl implements TipococheDao{
	@Autowired
	private TipococheRepository repository;
	
	@Override
	public Tipocoche create(Tipocoche ti) {
		// TODO Auto-generated method stub
		return repository.save(ti);
	}

	@Override
	public Tipocoche update(Tipocoche ti) {
		// TODO Auto-generated method stub
		return repository.save(ti);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Tipocoche> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Tipocoche> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
