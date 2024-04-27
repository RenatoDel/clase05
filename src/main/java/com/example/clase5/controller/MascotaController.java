package com.example.clase5.controller;

import com.example.clase5.repository.MascotaRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class MascotaController {
    public MascotaController(MascotaRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @GetMapping(value = {"/list", ""})
    public String listarTransportistas(Model model) {

        List<Employee> lista = employeeRepository.findAll();
        model.addAttribute("employeelist", lista);

        return "employee/Recursos_Humano_GTICS";
    }

}
