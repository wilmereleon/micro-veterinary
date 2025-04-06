package com.microservice.pet.http.response;

import com.microservice.pet.dto.ClientDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientByPetResponse {
    private String name;
    private String breed;
    private String color;
    private String gender;
    private List<ClientDTO> clientDTOList;
}
