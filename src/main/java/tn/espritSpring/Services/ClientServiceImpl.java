package tn.espritSpring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.espritSpring.DAO.entites.Client;
import tn.espritSpring.DAO.entites.Stock;
import tn.espritSpring.DAO.repository.ClientRepository;

@Service
public class ClientServiceImpl implements IClientService {
	
	@Autowired
	ClientRepository clientrepository;

	@Override
	public List<Client> retrieveAllClients() {

		List<Client> cl =(List<Client> )clientrepository.findAll();

		for (Client c: cl){
			
			System.out.println("test");
		}
		return cl;

		}
		
	@Override
	public Client addClient(Client c) {
		return clientrepository.save(c);
	}

	@Override
	public Client updateClient(Client c) {
		clientrepository.save(c);	
		return c;
	}

	@Override
	public Client retrieveClient(Long id) {
		 return clientrepository.findById(id).get();
	}

	@Override
	public void deleteClient(Long id) {
		clientrepository.deleteById(id);
		
	}


	
}
