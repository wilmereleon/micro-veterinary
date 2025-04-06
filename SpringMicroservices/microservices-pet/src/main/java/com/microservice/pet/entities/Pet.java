package com.microservice.pet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@Entity
@Builder
@Table(name = "Pets")
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String breed;
    @Column(name = "date_birth")
    private LocalDate dateOfBirth;
    private Double weight;
    private String color;
    private String gender;
    private Long clientId;
}
