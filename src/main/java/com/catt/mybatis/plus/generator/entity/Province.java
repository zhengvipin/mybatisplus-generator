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
 * 省份信息表
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
@TableName("t_province")
@ApiModel(value="Province对象", description="省份信息表")
public class Province extends Model<Province> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "省份id")
    @TableField("province_id")
    private String provinceId;

    @ApiModelProperty(value = "省份名称")
    @TableField("province_name")
    private String provinceName;


    public static final String ID = "id";

    public static final String PROVINCE_ID = "province_id";

    public static final String PROVINCE_NAME = "province_name";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
