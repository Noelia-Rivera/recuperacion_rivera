package pe.com.coches.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.coches.dao.MarcaDao;
import pe.com.coches.entity.Marca;
import pe.com.coches.service.MarcaService;

@Service
public class MarcaServiceImpl implements MarcaService{
	@Autowired
	private MarcaDao dao;
	
	@Override
	public Marca create(Marca ma) {
		// TODO Auto-generated method stub
		return dao.create(ma);
	}

	@Override
	public Marca update(Marca ma) {
		// TODO Auto-generated method stub
		return dao.update(ma);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Marca> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Marca> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
