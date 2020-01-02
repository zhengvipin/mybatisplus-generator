package com.catt.mybatis.plus.generator.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.catt.mybatis.plus.generator.entity.City;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 行政区域地州市信息表 Mapper 接口
 * </p>
 *
 * @author zwp
 * @since 2019-12-26
 */
@Mapper
public interface CityMapper extends BaseMapper<City> {

    /**
     * 查询以名字以'市'结尾的城市信息
     *
     * @return 城市列表
     */
    List<City> listCitiesCustomize();
}
