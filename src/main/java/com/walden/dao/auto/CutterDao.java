package com.walden.dao.auto;

import com.walden.entity.CutterEntity;
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
public interface CutterDao {

    @Select("SELECT * FROM goTurf.cutter")
    List<CutterEntity> getAllCutters();

    @Insert("INSERT INTO `goturf`.`cutter` (`cutter_id`, `cutter_name`, `cutter_sex`, `cutter_company`, `cutter_health`, `cutter_age`, `cutter_contact_number`, `cutter_email`) " +
            "VALUES ('6', 'Walden', '1', 'Golden', 'good', '33', '0478058560', 'walden.wuwei@shinetech.com')")
    void insertCutter(List<CutterEntity> cutters);
}