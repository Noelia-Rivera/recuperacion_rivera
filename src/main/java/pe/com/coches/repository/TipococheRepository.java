package pe.com.coches.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.coches.entity.Tipocoche;

@Repository
public interface TipococheRepository extends JpaRepository<Tipocoche, Long>{

}
