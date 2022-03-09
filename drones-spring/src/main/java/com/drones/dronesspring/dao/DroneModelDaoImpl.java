package com.drones.dronesspring.dao;

import com.drones.dronesspring.model.DroneModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class DroneModelDaoImpl extends JdbcDaoSupport implements DroneModelDao {
    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public List<DroneModel> getAllDroneModels() {
        String sql = "SELECT * FROM dronemodel;";
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

        List<DroneModel> result = new ArrayList<DroneModel>();
        for(Map<String, Object> row: rows) {
            DroneModel d_model = new DroneModel();
            d_model.setID((Integer) row.get("ID"));
            d_model.setName((String) row.get("name"));
            d_model.setUsers((String) row.get("users"));
            d_model.setCountry((String) row.get("country"));
            result.add(d_model);
        }
        return result;
    }

    @Override
    public void insertDroneModel(DroneModel d_model) {
        String sql = "INSERT INTO dronemodel " + "(ID, name, users, country) VALUES (?, ?, ?, ?)";
        getJdbcTemplate().update(sql, new Object[] { d_model.getID(), d_model.getName(), d_model.getUsers(), d_model.getCountry() });

    }

}
