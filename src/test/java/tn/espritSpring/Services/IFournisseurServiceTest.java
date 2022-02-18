package tn.espritSpring.Services;
import static org.junit.Assert.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.xml.ws.soap.Addressing;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import tn.espritSpring.DAO.entites.Fournisseur;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class IFournisseurServiceTest {
	@Autowired 
	IFournisseurService testfournisseurservice;
	@Test
	public void testDeleteFournisseur(){
		
		
		//testfournisseurservice.deleteFournisseur(100L);
		//assertNull(testfournisseurservice.retrieveFournisseur(100L));
		
	}
	
	
	
	@Test
	public void testRetrieveAllFournisseurs()
	{
		List<Fournisseur> fournisseur = testfournisseurservice.retrieveAllFournisseur();
		assertEquals(6,fournisseur.size());
	}
	
	
	
	@Test
	public void testRetrieveFournisseur()
	{
		Fournisseur fournisseur = testfournisseurservice.retrieveFournisseur(4L);
		assertEquals(4L,fournisseur.getIdFournisseur().longValue());
		
	}
	
	
	
	@Test
	public void testUpdateFournisseur() throws ParseException
	{
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date d= (Date) dateFormat.parse("2021-10-10");
		
		Fournisseur s = new Fournisseur(4L,"aa","aa","said",d,1,"aaa");
		Fournisseur updatedFournisseur= testfournisseurservice.updateFournisseur(s);
		//assertEquals(s.getLibelle(),updatedFournisseur.getLibelle());
	}
	
	
	

}
