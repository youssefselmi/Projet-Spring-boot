package tn.espritSpring.DAO.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.espritSpring.DAO.entites.Facture;
@Repository
public interface FactureRepository extends CrudRepository<Facture, Long> {

}
