package com.bus.content.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Zzxyu
 * @since 2024-03-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BusInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "informid", type = IdType.AUTO)
    private Integer informid;

    private String informmodel;

    private String informfactory;

    private String informtype;

    private Integer informlength;

    private Integer informwidth;

    private Integer informheight;

    private Integer informseat;

    private Integer informmainseat;

    private String informgrade;

    private String informfuel;

    private String informremark;


}
