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
public class BusLine implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "line_id", type = IdType.AUTO)
    private Integer lineId;

    private String lineName;

    private String lineBeginlocation;

    private String lineBegincode;

    private String lineEndlocation;

    private String lineEndcode;

    private Integer lineLinecount;

    private String lineHighin;

    private String lineHighout;

    private String lineArea;

    private Integer lineHighcount;

    private String lineMainstops;

    private String lineStops;

    private String lineRemark;


}
