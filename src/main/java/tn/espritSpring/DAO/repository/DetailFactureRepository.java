package tn.espritSpring.DAO.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.espritSpring.DAO.entites.DetailFacture;


@Repository
public interface DetailFactureRepository extends CrudRepository<DetailFacture, Long> {

}
