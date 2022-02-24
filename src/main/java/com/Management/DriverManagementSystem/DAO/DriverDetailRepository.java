package com.Management.DriverManagementSystem.DAO;

import java.util.List;



import com.Management.DriverManagementSystem.Entity.DriverDetail;


public interface DriverDetailRepository {

    DriverDetail saveDriver(DriverDetail driver);

    int updateDriver(DriverDetail driver);

    DriverDetail getById(int id);

    String deleteById(int id);

    List<DriverDetail> allDriver();
}
