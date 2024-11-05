package pe.com.coches.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.coches.dao.TipococheDao;
import pe.com.coches.entity.Tipocoche;
import pe.com.coches.service.TipococheService;

@Service
public class TipococheServiceImpl implements TipococheService{
	@Autowired
	private TipococheDao dao; 
	
	@Override
	public Tipocoche create(Tipocoche ti) {
		// TODO Auto-generated method stub
		return dao.create(ti);
	}

	@Override
	public Tipocoche update(Tipocoche ti) {
		// TODO Auto-generated method stub
		return dao.update(ti);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Tipocoche> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Tipocoche> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
