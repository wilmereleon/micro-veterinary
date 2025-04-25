package com.microservice.pet.controller;


import com.microservice.pet.entities.Pet;
import com.microservice.pet.service.IPetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pet")
public class PetController {
    final IPetService petService;

    public PetController(IPetService petService) {
        this.petService = petService;
    }
    @PostMapping("/ceate")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveClient(@RequestBody Pet pet) {
        petService.save(pet);
    }
    @GetMapping("/all")
    public ResponseEntity<?> findAllClient() {
        return ResponseEntity.ok(petService.findAll());
    }
    @GetMapping(    "/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(petService.findById(id));
    }
    @GetMapping( "/search/clients/{idPet}")
    public ResponseEntity<?> findClientByIdPet(@PathVariable Long idPet){
        return ResponseEntity.ok(petService.findClientByIdPet(idPet));
    }
}
