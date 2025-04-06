package com.microservice.pet.client;

import com.microservice.pet.dto.ClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-client", url = "localhost:8090/api/client")
public interface ClientClients {

    @GetMapping( "/search-by-pet/{idPet}")
    List<ClientDTO>findAllClientByPet(@PathVariable Long idPet);
}
