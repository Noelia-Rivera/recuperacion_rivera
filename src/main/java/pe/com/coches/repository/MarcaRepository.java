package pe.com.coches.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.coches.entity.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long>{

}
