package com.microservice.pet.service;

import com.microservice.pet.entities.Pet;
import com.microservice.pet.http.response.ClientByPetResponse;

import java.util.List;

public interface IPetService {
    List<Pet>findAll();
    Pet findById(Long id);
    void save(Pet pet);
    ClientByPetResponse findClientByIdPet(Long idPet);

}
