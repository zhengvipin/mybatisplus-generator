package com.catt.mybatis.plus.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * <p>
 * 行政区域地州市信息表
 * </p>
 *
 * @author zwp
 * @since 2019-12-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_city")
@ApiModel(value="City对象", description="行政区域地州市信息表")
public class City extends Model<City> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("city_id")
    private String cityId;

    @TableField("city_name")
    private String cityName;

    @TableField("province_id")
    private String provinceId;


    public static final String ID = "id";

    public static final String CITY_ID = "city_id";

    public static final String CITY_NAME = "city_name";

    public static final String PROVINCE_ID = "province_id";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
