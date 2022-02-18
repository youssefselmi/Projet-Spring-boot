package tn.espritSpring.Services;

import java.util.List;

import tn.espritSpring.DAO.entites.Client;


public interface IClientService  {

	
	
	List<Client> retrieveAllClients();

	Client addClient(Client c);

	Client updateClient(Client c);

	Client retrieveClient(Long id);
	 void deleteClient(Long id);

}
