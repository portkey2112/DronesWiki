package com.drones.dronesspring.controller;

import com.drones.dronesspring.model.DroneModel;
import com.drones.dronesspring.service.DroneModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DroneModelController {

    @Autowired
    DroneModelService d_model_service;

    @RequestMapping(value = "/drones/get", method = RequestMethod.GET)
    public List<DroneModel> getDroneModels() {
        return d_model_service.getAllDroneModels();
    }

    @RequestMapping(value = "/drones/addDrone", method = RequestMethod.POST)
    public void insertDrone(@RequestBody DroneModel d_model) {
        d_model_service.insertDroneModel(d_model);
    }

/*
    @RequestMapping(value = "/deleteDroneModel", method = RequestMethod.POST)
    public void deleteDrone(@RequestBody Integer ID) { d_model_service.deleteDroneModel(new Integer(ID));}*/


    @RequestMapping(value = "/drones/delete/{ID}", method = RequestMethod.DELETE)
    public void deleteDrone(@PathVariable Integer ID) { d_model_service.deleteDroneModel(ID);}


}
