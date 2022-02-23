package com.Management.DriverManagementSystem.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Management.DriverManagementSystem.Entity.DriverDetail;

import java.util.List;

@Repository
public class DriverDetailRepositoryImpl implements DriverDetailRepository {

	  private static final String INSERT_DRIVER_QUERY = "INSERT INTO drivers(FirstName,LastName,BirthDate,Address) values(?,?,?,?)";
	    private static final String UPDATE_DRIVER_BY_NAME_QUERY = "UPDATE drivers SET lastName=?,Birthdate=?,Address=? WHERE FirstName=?";
	    private static final String GET_DRIVER_BY_NAME_QUERY = "SELECT * FROM drivers WHERE FirstName=?";
	    private static final String DELETE_DRIVER_BY_NAME = "DELETE FROM drivers WHERE FirstName=?";
	    private static final String GET_DRIVER_QUERY = "SELECT * FROM drivers";
	    @Autowired
	    private JdbcTemplate jdbcTemplate;

	    @Override
	    public DriverDetail saveDriver(DriverDetail driver) {
	        jdbcTemplate.update(INSERT_DRIVER_QUERY, driver.getFirstName(), driver.getLastName(), driver.getBirthDate(), driver.getAddress());
	        return driver;
	    }

	    @Override
	    public DriverDetail updateDriver(DriverDetail driver) {
	        jdbcTemplate.update(UPDATE_DRIVER_BY_NAME_QUERY, driver.getLastName(),driver.getBirthDate(),driver.getAddress(), driver.getFirstName());
	        return driver;
	    }

	    @Override
	    public DriverDetail getByName(String FirstName) {
	        return jdbcTemplate.queryForObject(GET_DRIVER_BY_NAME_QUERY, (rs, rowNum) -> {

	            return new DriverDetail(rs.getString("FirstName"), rs.getString("LastName"), rs.getString("BirthDate"), rs.getString("Address"));
	        },FirstName);
	    }

	    @Override
	    public String deleteByName(String FirstName) {
	        jdbcTemplate.update(DELETE_DRIVER_BY_NAME, FirstName);
	        return "Driver got deleted with FirstName " + FirstName;
	    }

	    @Override
	    public List<DriverDetail> allDriver() {
	        return jdbcTemplate.query(GET_DRIVER_QUERY, (rs, rowNum) -> {
	            return new DriverDetail(rs.getString("FirstName"), rs.getString("LastName"), rs.getString("BirthDate"), rs.getString("Address"));
	        });
	    }
}
