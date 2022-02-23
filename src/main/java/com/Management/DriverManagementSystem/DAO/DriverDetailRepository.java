package com.Management.DriverManagementSystem.DAO;

import java.util.List;



import com.Management.DriverManagementSystem.Entity.DriverDetail;


public interface DriverDetailRepository {

    DriverDetail saveDriver(DriverDetail driver);

    DriverDetail updateDriver(DriverDetail driver);

    DriverDetail getByName(String FirstName);

    String deleteByName(String FirstName);

    List<DriverDetail> allDriver();
}
