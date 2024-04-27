package com.example.clase5.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idservicio")
    private int idServicio;

    @ManyToOne
    @JoinColumn(name = "mascota_idmascota")
    private Mascota mascota;

    @ManyToOne
    @JoinColumn(name = "cuenta_idcuenta")
    private Cuenta cuenta;

    @Column(name = "hora_inicio", nullable = false)
    private String horaInicio;

    @Column(name = "duracion", nullable = false)
    private int duracion;

    @Column(name = "entrega", nullable = false)
    private String entrega;

    @ManyToOne
    @JoinColumn(name = "responsable_idresponsable")
    private Responsable responsable;

    // Getters and setters
}

