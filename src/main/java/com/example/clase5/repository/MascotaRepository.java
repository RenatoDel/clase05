package com.example.clase5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MascotaRepository extends JpaRepository<Mascota, Integer>{
    @Query(nativeQuery = true, value = "SELECT * FROM sandylance.mascotas where name LIKE %?1%")
    List<Mascota> buscarPorNombreCompania(String textoIngreso);

    @Query(nativeQuery = true, value = "SELECT e.first_name AS nombre" +
            "    e.last_name AS apellido" +
            "    j.job_title AS puesto" +
            "    l.city AS ciudad" +
            "    FROM employees e" +
            "    JOIN jobs j ON e.job_id = j.job_id" +
            "    JOIN locations l ON e.location_id = l.location_id; where id_sede=?1")
    List<Employee> listarEmployee(Integer employeeid);

}
