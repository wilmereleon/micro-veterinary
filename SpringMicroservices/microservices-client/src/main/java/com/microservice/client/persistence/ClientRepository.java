package com.microservice.client.persistence;

import com.microservice.client.entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    List<Client> findAllByPetId(Long petId);
}
