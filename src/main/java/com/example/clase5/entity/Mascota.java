package com.example.clase5.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmascota")
    private int idMascota;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "anho", nullable = false)
    private String anho;

    @Column(name = "historia", nullable = false)
    private String historia;

    @Column(name = "observaciones", nullable = false)
    private String observaciones;

    @Column(name = "sexo", nullable = false)
    private String sexo;

    @ManyToOne
    @JoinColumn(name = "raza_especie_idraza")
    private RazaEspecie razaEspecie;

    @Column(name = "raza_otros")
    private String razaOtros;

    @ManyToOne
    @JoinColumn(name = "cuenta_idcuenta")
    private com.example.clase5.entity.Cuenta cuenta;

    // Getters and setters
}

