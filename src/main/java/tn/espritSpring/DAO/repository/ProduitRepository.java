package tn.espritSpring.DAO.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.espritSpring.DAO.entites.Produit;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Long> {

}
