package com.example.clase5.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "opcion_servicio")
public class OpcionServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idopcion_servicio")
    private int idOpcionServicio;

    @ManyToOne
    @JoinColumn(name = "opcion_idopcion")
    private Opcion opcion;

    @ManyToOne
    @JoinColumn(name = "servicio_idservicio")
    private Servicio servicio;

    // Getters and setters
}
