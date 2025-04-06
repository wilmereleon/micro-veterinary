package com.microservice.client.service;

import com.microservice.client.entities.Client;

import java.util.List;

public interface IClientService {
    List<Client> findAll();
    Client findById(Long id);
    void save(Client client);
    List<Client> findByIdPet(Long petId);
}
