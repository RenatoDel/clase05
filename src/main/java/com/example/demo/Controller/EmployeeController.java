package com.example.demo.Controller;

import com.example.demo.Entity.Employees;
import com.example.demo.Repository.LocationsRepository;
import com.example.demo.Repository.DepartmentRepository;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Repository.JobsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    final EmployeeRepository employeeRepository;
    final JobsRepository jobsRepository;
    final DepartmentRepository departmentRepository;
    private final LocationsRepository locationsRepository;


    public EmployeeController(EmployeeRepository employeeRepository, JobsRepository jobsRepository, DepartmentRepository departmentRepository,
                              LocationsRepository locationsRepository) {
        this.employeeRepository = employeeRepository;
        this.jobsRepository = jobsRepository;
        this.departmentRepository = departmentRepository;
        this.locationsRepository = locationsRepository;
    }

    @GetMapping(value = {"/", ""})
    public String listarEmpleados(Model model) {

        model.addAttribute("listarEmpleados", employeeRepository.findAll());

        return "employee/listEmployee";
    }
    @GetMapping("/new")
    public String nuevoEmployeeFrm(Model model) {
        model.addAttribute("listarTrabajos", jobsRepository.findAll());
        model.addAttribute("listarDepartamentos", departmentRepository.findAll());
        model.addAttribute("listarCiudades", locationsRepository.findAll());
        model.addAttribute("listarEmpleados", employeeRepository.findAll());
        return "employee/newEmployee";
    }

    @PostMapping("/save")
    public String guardarNuevoEmpleado(@ModelAttribute Employees employees, RedirectAttributes attr) {
        employeeRepository.save(employees);
        return "redirect:/employee/listEmployee";
    }

    @GetMapping("/edit")
    public String editarTransportista(Model model, @RequestParam("id") int id) {

        Optional<Employees> optEmployees = employeeRepository.findById(id);

        if (optEmployees.isPresent()) {
            Employees employees = optEmployees.get();
            model.addAttribute("listarTrabajos", jobsRepository.findAll());
            model.addAttribute("listarDepartamentos", departmentRepository.findAll());
            model.addAttribute("listarCiudades", locationsRepository.findAll());
            model.addAttribute("listarEmpleados", employeeRepository.findAll());
            model.addAttribute("employee", employees);
            return "employee/editEmployee";
        } else {
            return "redirect:/employee";
        }
    }

    @GetMapping("/delete")
    public String borrarTransportista(Model model,
                                      @RequestParam("id") int id,
                                      RedirectAttributes attr) {

        Optional<Employees> optEmployees = employeeRepository.findById(id);

        if (optEmployees.isPresent()) {
            employeeRepository.deleteById(id);
        }
        return "redirect:/employee";

    }



}
