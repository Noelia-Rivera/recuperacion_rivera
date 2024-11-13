package pe.com.coches.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.coches.entity.Rol;

public interface RolRepository extends JpaRepository<Rol,Long> {
}
