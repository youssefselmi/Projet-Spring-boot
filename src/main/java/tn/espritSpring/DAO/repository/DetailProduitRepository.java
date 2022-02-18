package tn.espritSpring.DAO.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.espritSpring.DAO.entites.DetailProduit;;
@Repository
public interface DetailProduitRepository  extends CrudRepository<DetailProduit, Long> {

}
