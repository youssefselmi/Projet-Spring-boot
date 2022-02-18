package tn.espritSpring.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.espritSpring.DAO.entites.Facture;
import tn.espritSpring.DAO.entites.Produit;

@Service
@Slf4j
public class FactureServiceImpl implements IFactureService {
	@Autowired
	tn.espritSpring.DAO.repository.FactureRepository facturerepository;
	
	
	@Override
	public List<Facture> retrieveAllFacture() {
		List<Facture> factures =(List<Facture> )facturerepository.findAll();

		for (Facture f: factures){
			
			System.out.println("test");
		}
		return factures;
	}

	@Override
	public Facture addFacture(Facture f) {
		f.setActive(true);
		return facturerepository.save(f);
	}

	@Override
	public void deleteFacture(Long id) {
		facturerepository.deleteById(id);		
	}

	@Override
	public Facture updateFacture(Facture f) {
		facturerepository.save(f);
		return f;
	}

	@Override
	public Facture retrieveFacture(Long id) {
		 return facturerepository.findById(id).get();
	}

	@Override
	public void cancelFacture(Long id) {
		Facture facture = facturerepository.findById(id).get();
		facture.setActive(false);
		facturerepository.save(facture);
		
	}
	
	
	

	//@Scheduled(cron="0 0 0 1 * *")
	@Override
	public void revenuEvryMonth() { 
		
	Date nowDate = new Date();
		
		@SuppressWarnings("deprecation")
		int nowMonth = nowDate.getMonth();
		@SuppressWarnings("deprecation")
		int nowYear= nowDate.getYear();
		
		float revenuPerMonth=0;
		float revenuPerYear=0;
		List<Facture>factures = (List<Facture>) facturerepository.findAll();
		
	
		for(Facture facture : factures)
		{
			@SuppressWarnings("deprecation")
			int factureMonth = facture.getDateFacture().getMonth();
			@SuppressWarnings("deprecation")
			int factureYear= facture.getDateFacture().getYear();
			
		if((factureMonth==nowMonth-1)&&(factureYear==nowYear)&&(factureMonth!=0))
			{
				
			revenuPerMonth = revenuPerMonth + facture.getMontantFacture();
			
			}
		else if((nowMonth==0)&&(factureYear==nowYear-1))
		{
			revenuPerYear = revenuPerYear + facture.getMontantFacture();
		}
			}
		
		int revenuMonth = nowMonth-1; 
		int revenuYear = nowYear; 
		log.info("le revenu de magasin pour le mois : "+revenuMonth+"est: "+revenuPerMonth);
		log.info("le revenu de magasin pour cette année: "+revenuYear+"est"+revenuPerYear);
		
	}
	
	
	

}
