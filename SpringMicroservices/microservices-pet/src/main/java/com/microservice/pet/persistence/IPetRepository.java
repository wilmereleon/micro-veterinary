package com.microservice.pet.persistence;

import com.microservice.pet.entities.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPetRepository extends CrudRepository<Pet, Long> {

}
