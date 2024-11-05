package pe.com.coches.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.coches.entity.Coche;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long>{

}
