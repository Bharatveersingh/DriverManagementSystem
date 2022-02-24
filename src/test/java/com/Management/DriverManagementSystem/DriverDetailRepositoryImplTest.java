package com.Management.DriverManagementSystem;

import com.Management.DriverManagementSystem.DAO.DriverDetailRepository;
import com.Management.DriverManagementSystem.Entity.DriverDetail;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DriverDetailRepositoryImplTest {
    @Autowired
    DriverDetailRepository DriverRepo;

    @Test
    void saveDriver()
    {
        DriverDetail driver = new DriverDetail(4,"ramesh","kumar","22-01-1999","Mumbai");
        DriverDetail check = DriverRepo.saveDriver(driver);
        assertNotNull(check);
    }

    @Test
    void updateDriver()
    {
        DriverDetail driver = DriverRepo.getById(1);
        driver.setAddress("Anadra");
        int DriverUpdate =  DriverRepo.updateDriver(driver);
        Assertions.assertThat(DriverUpdate).isEqualTo(1);
    }

    @Test
    void getByName()
    {
        DriverDetail driver = DriverRepo.getById(1);
        assertNotNull(driver);
    }

    @Test
    void deleteByName()
    {
        DriverRepo.deleteById(4);
        List<DriverDetail> list = DriverRepo.allDriver();
        Assertions.assertThat(list.size()).isGreaterThan(0);
    }

    @Test
    void allDriver()
    {
        List<DriverDetail> list = DriverRepo.allDriver();
        Assertions.assertThat(list).size().isGreaterThan(0);
    }
}