package com.aluguelcarros.backend.repository;

import com.aluguelcarros.backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
    
    usuarioRepository.findById(aluguel.getUsuario().getId())
    .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

}


