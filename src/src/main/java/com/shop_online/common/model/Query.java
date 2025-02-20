package com.shop_online.common.model;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author sunyu
 */
@Data
public class Query {
    @NotNull(message = "页码不能为空")
    @Min(value = 1, message = "页码最小值为 1")
    Integer page;

    @NotNull(message = "每页条数不能为空")
    @Range(min = 1, max = 100, message = "每页条数，取值范围 1-100")
    Integer limit;

    String order;

    boolean asc;
}
