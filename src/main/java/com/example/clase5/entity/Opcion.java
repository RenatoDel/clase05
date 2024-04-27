package com.example.clase5.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "opcion")
public class Opcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idopcion")
    private int idOpcion;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "tiempo_minutos", nullable = false)
    private int tiempoMinutos;

    @Column(name = "precio", nullable = false)
    private float precio;

    // Getters and setters
}
