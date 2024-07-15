package com.forohub.api.modelo.usuarioautenticacion;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioAutenticacionRepository extends JpaRepository<UsuriousAuthentication, Long> {
    //UserDetails findByEmail(String username);
    Optional<UsuriousAuthentication> findByEmail(String email);
}
