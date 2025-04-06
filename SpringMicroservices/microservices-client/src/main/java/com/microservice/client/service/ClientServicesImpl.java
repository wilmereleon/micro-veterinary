package com.microservice.client.service;

import com.microservice.client.entities.Client;
import com.microservice.client.persistence.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ClientServicesImpl implements IClientService{

    final ClientRepository clientRepository;

    public ClientServicesImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public List<Client> findAll() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Client client) {
        clientRepository.save(client);
    }

    @Override
    public List<Client> findByIdPet(Long petId) {
        return clientRepository.findAllByPetId(petId);
    }
}
