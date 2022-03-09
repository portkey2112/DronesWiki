package com.drones.dronesspring.controller;

import com.drones.dronesspring.model.DroneModel;
import com.drones.dronesspring.service.DroneModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DroneModelController {

    @Autowired
    DroneModelService d_model_service;

    @RequestMapping(value = "/droneModels", method = RequestMethod.GET)
    public List<DroneModel> getDroneModels() {
        return d_model_service.getAllDroneModels();
    }

    @RequestMapping(value = "/insertDroneModel", method = RequestMethod.POST)
    public void insertDrone(@RequestBody DroneModel d_model) {
        d_model_service.insertDroneModel(d_model);
    }
}
