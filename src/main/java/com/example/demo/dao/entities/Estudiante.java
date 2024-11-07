package com.example.demo.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "estudiante")
@Getter
@Setter
@NoArgsConstructor
public class Estudiante {

    @Id
    private String docEst;
    private String nomEst;
    private String apeEst;
    private Integer edadEst;
}
