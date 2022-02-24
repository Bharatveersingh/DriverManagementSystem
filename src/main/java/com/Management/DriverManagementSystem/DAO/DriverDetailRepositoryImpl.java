package com.Management.DriverManagementSystem.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Management.DriverManagementSystem.Entity.DriverDetail;

import java.util.List;

@Repository
public class DriverDetailRepositoryImpl implements DriverDetailRepository {

	  private static final String INSERT_DRIVER_QUERY = "INSERT INTO driver(id ,FirstName,LastName,BirthDate,Address) values(?,?,?,?,?)";
	    private static final String UPDATE_DRIVER_BY_Id_QUERY = "UPDATE driver SET firstName = ?, lastName=?,Birthdate=?,Address=? WHERE id=?";
	    private static final String GET_DRIVER_BY_Id_QUERY = "SELECT * FROM driver WHERE id=?";
	    private static final String DELETE_DRIVER_BY_NAME = "DELETE FROM driver WHERE id=?";
	    private static final String GET_DRIVER_QUERY = "SELECT * FROM driver";
	    @Autowired
	    private JdbcTemplate jdbcTemplate;

	    @Override
	    public DriverDetail saveDriver(DriverDetail driver) {
	        jdbcTemplate.update(INSERT_DRIVER_QUERY,driver.getId(), driver.getFirstName(), driver.getLastName(), driver.getBirthDate(), driver.getAddress());
	        return driver;
	    }

	    @Override
	    public int updateDriver(DriverDetail driver) {
	        return jdbcTemplate.update(UPDATE_DRIVER_BY_Id_QUERY, driver.getFirstName(),driver.getLastName(),driver.getBirthDate(),driver.getAddress(), driver.getId());
	        
	    }

	    @Override
	    public DriverDetail getById(int id) {
	        return jdbcTemplate.queryForObject(GET_DRIVER_BY_Id_QUERY, (rs, rowNum) -> {

	            return new DriverDetail(rs.getInt("id"),rs.getString("firstName"), rs.getString("lastName"), rs.getString("birthDate"), rs.getString("address"));
	        },id);
	    }

	    @Override
	    public String deleteById(int id) {
	        jdbcTemplate.update(DELETE_DRIVER_BY_NAME, id);
	        return "Driver got deleted with FirstName " + id;
	    }

	    @Override
	    public List<DriverDetail> allDriver() {
	        return jdbcTemplate.query(GET_DRIVER_QUERY, (rs, rowNum) -> {
	            return new DriverDetail(rs.getInt("id"),rs.getString("firstName"), rs.getString("lastName"), rs.getString("birthDate"), rs.getString("address"));
	        });
	    }
}
