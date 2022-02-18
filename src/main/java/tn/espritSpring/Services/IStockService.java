package tn.espritSpring.Services;

import java.util.List;

import tn.espritSpring.DAO.entites.Stock;;

public interface IStockService {
	List<Stock> retrieveAllStocks();

	Stock addStock(Stock s);

	Stock updateStock(Stock u);

	Stock retrieveStock(Long id);
	 void deleteStock(Long id);
	 void stockStatus();

}
