package com.drones.dronesspring.dao;

import com.drones.dronesspring.model.DroneModel;

import java.util.List;

public interface DroneModelDao {
    List<DroneModel>  getAllDroneModels();
    void insertDroneModel (DroneModel d_model);
    void deleteDroneModel (Integer ID);
}
