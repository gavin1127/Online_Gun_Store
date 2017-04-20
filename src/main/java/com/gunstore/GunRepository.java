package com.gunstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Gavin on 4/19/17.
 */
@Component
public class GunRepository {

    @Autowired
    JdbcTemplate template;

    public List<LongGun> listLongGuns(){
        return template.query(
                "SELECT * FROM longguns ORDER BY long_gun_id",
                (rs, i) -> new LongGun(
                        rs.getInt("long_gun_id"),
                        rs.getString("long_gun_name"),
                        rs.getBigDecimal("long_gun_price"),
                        rs.getString("long_gun_caliber")));

    }
}