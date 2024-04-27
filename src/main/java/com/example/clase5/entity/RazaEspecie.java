package com.example.clase5.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "raza_especie")
public class RazaEspecie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idraza")
    private int idRaza;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    // Getters and setters
}
