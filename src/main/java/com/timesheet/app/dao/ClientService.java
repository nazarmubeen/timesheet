package com.timesheet.app.dao;

import java.util.Collection;
import java.util.Optional;

import com.timesheet.app.model.Client;

public interface ClientService {

	
   Optional<Client> getClientByClientId(long clientid);

    
    Collection<Client> getAllClients();
    
    Client setClient(Client client);
    
    void deleteClient(long clientId);
    
    Client findById(long id);
    
    Client updateUser(Client client);
}
