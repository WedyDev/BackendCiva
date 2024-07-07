package pe.civa.civatecnica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.civa.civatecnica.entities.futbolistas;

@Repository
public interface Ifutbolitas extends JpaRepository<futbolistas,Integer> {
}
