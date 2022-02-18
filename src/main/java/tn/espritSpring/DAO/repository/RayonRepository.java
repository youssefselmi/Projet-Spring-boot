package tn.espritSpring.DAO.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.espritSpring.DAO.entites.Rayon;

@Repository
public interface RayonRepository extends CrudRepository<Rayon, Long> {

}
