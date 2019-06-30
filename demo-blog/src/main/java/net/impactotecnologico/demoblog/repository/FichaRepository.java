package net.impactotecnologico.demoblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.impactotecnologico.demoblog.model.Ficha;

@Repository
public interface FichaRepository extends JpaRepository<Ficha, Integer> {

}
