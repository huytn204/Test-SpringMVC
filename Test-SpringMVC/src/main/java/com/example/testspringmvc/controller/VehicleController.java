package com.example.testspringmvc.controller;


import com.example.testspringmvc.entity.Vehicle;
import com.example.testspringmvc.rep.VehicleRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class VehicleController {
    @Autowired
    private VehicleRep vehicleRep;

    @GetMapping("/")
    public String VehicleList(Model model) {
        List<Vehicle> vehicles = vehicleRep.findAll();
        model.addAttribute("vehicles", vehicles);
        return "catalog"; // Ensure this file exists in src/main/resources/templates
    }

    @GetMapping("/create")
    public String showAddVehicleForm(Model model) {
        model.addAttribute("vehicle", new Vehicle());
        return "vehicle-form";
    }

    @PostMapping("/add")
    public String addVehicle(@ModelAttribute Vehicle vehicle, BindingResult bindingResult) {
        vehicleRep.save(vehicle);
        return "redirect:/"; // Redirect to root URL to show updated product list
    }

    @GetMapping("/edit/{id}")
    public String showEditVehicleForm(@PathVariable Long id, Model model) {
        Vehicle vehicle = vehicleRep.findById(id).orElseThrow(()
                -> new IllegalArgumentException("Invalid product Id:" + id));
        model.addAttribute("vehicle", vehicle);
        return "vehicle-form";
    }
    @PostMapping("/update/{id}")
    public String updateVehicle(@PathVariable Long id, @ModelAttribute Vehicle vehicle) {
        Vehicle vehicle1 = vehicleRep.findById(id).orElseThrow(()
                -> new IllegalArgumentException("Invalid product Id:" + id));
        vehicle1.setVehicle_Name(vehicle.getVehicle_Name());
        vehicle1.setVehicle_Color(vehicle.getVehicle_Color());
        vehicle1.setVehicle_Model(vehicle.getVehicle_Model());
        vehicle1.setYear_Of_Manufacture(vehicle.getYear_Of_Manufacture());

        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String deleteVehicle(@PathVariable Long id) {
        vehicleRep.deleteById(id);
        return "redirect:/";
    }
}
