package com.example.clase5.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "responsable")
public class Responsable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idresponsable")
    private int idResponsable;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    // Getters and setters
}
