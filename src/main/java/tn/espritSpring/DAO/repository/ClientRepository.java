package tn.espritSpring.DAO.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.espritSpring.DAO.entites.Client;;

@Repository
public interface ClientRepository  extends CrudRepository<Client, Long>{

}
