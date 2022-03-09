package com.drones.dronesspring.service;

import com.drones.dronesspring.dao.DroneModelDao;
import com.drones.dronesspring.model.DroneModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneModelServiceImpl implements DroneModelService{
    @Autowired
    DroneModelDao droneModelDao;

    @Override
    public List<DroneModel> getAllDroneModels() {
        List<DroneModel> drone_models = droneModelDao.getAllDroneModels();
        return drone_models;
    }

    @Override
    public void insertDroneModel(DroneModel d_model) {
        droneModelDao.insertDroneModel(d_model);
    }

}
