package com.walden.dao.auto;

import com.walden.entity.LayerEntity;
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
public interface LayerDao {

    @Select("SELECT * FROM goTurf.layer")
    List<LayerEntity> getAllLayers();

    @Insert("INSERT INTO `goturf`.`layer` (`layer_id`, `layer_name`, `layer_company`, `layer_sex`, `layer_age`, `layer_health`, `layer_contact_number`, `layer_email`, `layer_address`, `is_online`) " +
            "VALUES ('7', 'yy', 'yy', '5', '6', 'gg', 'hh', 'hh', 'hh', '33')")
    void insertLayers(List<LayerEntity> layers);
}