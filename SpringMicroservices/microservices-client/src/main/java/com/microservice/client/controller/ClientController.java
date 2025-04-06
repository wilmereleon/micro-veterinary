package com.microservice.client.controller;


import com.microservice.client.entities.Client;
import com.microservice.client.service.IClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    final IClientService iClientService;


    public ClientController(IClientService iClientService) {
        this.iClientService = iClientService;
    }

    @PostMapping("/ceate")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveClient(@RequestBody Client client) {
        iClientService.save(client);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllClient() {
        return ResponseEntity.ok(iClientService.findAll());
    }

    @GetMapping(    "/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(iClientService.findById(id));
    }

    //endpoint que consume microservcio de mascotas
    @GetMapping( "/search-by-pet/{idPet}")
    public ResponseEntity<?>findByIdPet(@PathVariable Long idPet){
        return ResponseEntity.ok(iClientService.findByIdPet(idPet));
    }


}
