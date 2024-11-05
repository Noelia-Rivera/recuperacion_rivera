package pe.com.coches.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.coches.dao.CocheDao;
import pe.com.coches.entity.Coche;
import pe.com.coches.service.CocheService;

@Service
public class CocheServiceImpl implements CocheService{
	@Autowired
	private CocheDao dao;
	
	@Override
	public Coche create(Coche co) {
		// TODO Auto-generated method stub
		return dao.create(co);
	}

	@Override
	public Coche update(Coche co) {
		// TODO Auto-generated method stub
		return dao.update(co);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Coche> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Coche> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
