package com.catt.mybatis.plus.generator.controller;


import com.catt.mybatis.plus.generator.entity.City;
import com.catt.mybatis.plus.generator.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 行政区域地州市信息表 前端控制器
 * </p>
 *
 * @author zwp
 * @since 2019-12-26
 */
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService service;

    @GetMapping("/listCitiesCustomize")
    public List<City> listCitiesCustomize() {
        return service.listCitiesCustomize();
    }
}
