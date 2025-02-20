package com.shop_online.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sunyu
 */
@Data
@AllArgsConstructor
@Schema(description = "用户登录")
public class SysTokenVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "access_token")
    private String access_token;
}
