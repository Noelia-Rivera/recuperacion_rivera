package pe.com.coches.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.coches.entity.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    Optional<Usuario> findByUsername(String username);
}
