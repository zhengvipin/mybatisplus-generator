package com.catt.mybatis.plus.generator.service;

import com.catt.mybatis.plus.generator.entity.City;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 行政区域地州市信息表 服务类
 * </p>
 *
 * @author zwp
 * @since 2019-12-26
 */
public interface CityService extends IService<City> {
    /**
     * 查询以名字以'市'结尾的城市信息
     *
     * @return 城市列表
     */
    List<City> listCitiesCustomize();
}
