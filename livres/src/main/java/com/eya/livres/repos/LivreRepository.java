package com.eya.livres.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eya.livres.entities.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {

}
