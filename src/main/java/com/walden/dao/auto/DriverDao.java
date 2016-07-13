package com.walden.dao.auto;

import com.walden.entity.DriverEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by walden on 16/7/3.
 */
@Component
@Transactional
public interface DriverDao {

    @Select("SELECT * FROM goTurf.driver")
    List<DriverEntity> getAllDrivers();

    @Insert("INSERT INTO `goturf`.`driver` (`driver_id`, `driver_name`, `driver_company`, `driver_sex`, `driver_age`, `driver_health`, `is_online`, `driver_contact_number`, `driver_email`, `driver_address`) " +
            "VALUES ()")
    void insertDriver(List<DriverEntity> drivers);
}
