package com.timesheet.app.dao;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.app.model.Client;

@Service
public class ClientServiceImpl implements ClientService {

	private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

	@Override
	public Optional<Client> getClientByClientId(long clientid) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(clientRepository.findOne( clientid));
	}

	@Override
	public Collection<Client> getAllClients() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	@Override
	public Client setClient(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);
	}

	@Override
	public void deleteClient(long ClientId) {
		// TODO Auto-generated method stub
		 clientRepository.delete(ClientId);;
	}

	@Override
	public Client findById(long id) {
		// TODO Auto-generated method stub
		return clientRepository.findOne(id);
	}

	@Override
	public Client updateUser(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
