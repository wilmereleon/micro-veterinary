package com.microservice.pet.service;

import com.microservice.pet.client.ClientClients;
import com.microservice.pet.dto.ClientDTO;
import com.microservice.pet.entities.Pet;
import com.microservice.pet.http.response.ClientByPetResponse;
import com.microservice.pet.persistence.IPetRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PerServiceImpl implements IPetService{

    final IPetRepository iPetRepository;

    final ClientClients clientClients;

    public PerServiceImpl(IPetRepository iPetRepository, ClientClients clientClients) {
        this.iPetRepository = iPetRepository;
        this.clientClients = clientClients;
    }

    @Override
    public List<Pet> findAll() {
        return (List<Pet>) iPetRepository.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return iPetRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Pet pet) {
        iPetRepository.save(pet);
    }

    @Override
    public ClientByPetResponse findClientByIdPet(Long idPet) {

        //Consultar la mascota
        Pet pet = iPetRepository.findById(idPet).orElse(new Pet());

        //Obtener los clientes
        List<ClientDTO> clientDTOList = clientClients.findAllClientByPet(idPet);

        return ClientByPetResponse.builder()
                .name(pet.getName())
                .breed(pet.getBreed())
                .color(pet.getColor())
                .gender(pet.getGender())
                .clientDTOList(clientDTOList)
                .build();
    }
}
