package tn.espritSpring.DAO.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.espritSpring.DAO.entites.Stock;

@Repository

public interface StockRepository extends CrudRepository<Stock, Long> {

}
