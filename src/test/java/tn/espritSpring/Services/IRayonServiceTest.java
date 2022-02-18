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
import tn.espritSpring.DAO.entites.Rayon;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j

public class IRayonServiceTest {
	
	@Autowired 
	IRayonService rs;
	@Test
	public void testDeleteRayon(){
		
		
		//rs.deleteRayon(100L);
		//assertNull(rs.retrieveFournisseur(100L));
		
	}
	
	
	
	@Test
	public void testRetrieveAllRayons()
	{
		List<Rayon> rayon = rs.retrieveAllRayon();
		assertEquals(6,rayon.size());
	}
	
	
	@Test
	public void testRetrieveRayon()
	{
		Rayon rayon = rs.retrieveRayon(4L);
		assertEquals(4L,rayon.getIdRayon().longValue());
		
	}
	
	
	
	
	@Test
	public void testUpdateRayon() 
	{
		
		
		
		Rayon s = new Rayon(4L,"aa","aa",1);
		Rayon updatedRayon= rs.updateRayon(s);
		assertEquals(s.getLibelle(),updatedRayon.getLibelle());
	}
	
	

}
