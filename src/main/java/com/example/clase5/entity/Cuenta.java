package com.example.clase5.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cuenta")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcuenta")
    private int idCuenta;

    @Column(name = "correo")
    private String correo;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @Column(name = "admin")
    private int admin;

    // Getters and setters
}
