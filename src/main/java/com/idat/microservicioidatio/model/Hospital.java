package com.idat.microservicioidatio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Table(name = "Hospital")
@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHospital;
    private String nombreHospital;
}
