package tn.espritSpring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.espritSpring.DAO.entites.Produit;
import tn.espritSpring.DAO.entites.Stock;

import tn.espritSpring.DAO.repository.ProduitRepository;
import tn.espritSpring.DAO.repository.StockRepository;



	
@Service
@Slf4j
public class StockServiceImpl implements tn.espritSpring.Services.IStockService{
	@Autowired
	StockRepository sr;

	@Override
	public List<Stock> retrieveAllStocks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock addStock(Stock s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock updateStock(Stock u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock retrieveStock(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStock(Long id) {
		// TODO Auto-generated method stub
		
	}

	
	//@Scheduled(fixedRate = 60000)
	@Override
	public void stockStatus() {
		
		
		
	
	List<Stock> stocks = (List<Stock>) sr.findAll();
	
	for(Stock stock : stocks)
	{
		if(stock.getQte() < stock.getQteMin())
		{
			log.info("le stock: "+stock.getLibelleStock()+" est en danger de repture"); 
		}
		
		else if(stock.getQte()==0)
		{
			log.info("le stock: "+stock.getLibelleStock()+" est repture"); 
		}
		
	}
		
		
			
	}
		
	
	
	
	
	

}
