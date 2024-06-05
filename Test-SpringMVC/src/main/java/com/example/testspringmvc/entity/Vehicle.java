package com.example.testspringmvc.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicle_id;


    private String vehicle_Name;
    private String vehicle_Model;
    private int year_Of_Manufacture;
    private String vehicle_Color;

    public Vehicle(Long vehicle_id, String vehicle_Name, String vehicle_Model, int year_Of_Manufacture, String vehicle_Color) {
        this.vehicle_id = vehicle_id;
        this.vehicle_Name = vehicle_Name;
        this.vehicle_Model = vehicle_Model;
        this.year_Of_Manufacture = year_Of_Manufacture;
        this.vehicle_Color = vehicle_Color;
    }

    public Vehicle() {}

    public Long getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(Long vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_Name() {
        return vehicle_Name;
    }

    public void setVehicle_Name(String vehicle_Name) {
        this.vehicle_Name = vehicle_Name;
    }

    public String getVehicle_Model() {
        return vehicle_Model;
    }

    public void setVehicle_Model(String vehicle_Model) {
        this.vehicle_Model = vehicle_Model;
    }

    public int getYear_Of_Manufacture() {
        return year_Of_Manufacture;
    }

    public void setYear_Of_Manufacture(int year_Of_Manufacture) {
        this.year_Of_Manufacture = year_Of_Manufacture;
    }

    public String getVehicle_Color() {
        return vehicle_Color;
    }

    public void setVehicle_Color(String vehicle_Color) {
        this.vehicle_Color = vehicle_Color;
    }
}
