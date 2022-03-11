package com.drones.dronesspring.service;

import com.drones.dronesspring.model.DroneModel;
import java.util.List;

public interface DroneModelService {
    List<DroneModel>  getAllDroneModels();
    void insertDroneModel(DroneModel droneModel);

    void deleteDroneModel(Integer ID);
}
