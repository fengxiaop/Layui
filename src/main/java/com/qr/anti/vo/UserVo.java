package com.qr.anti.vo;

import com.qr.anti.base.BaseValue;
import lombok.Data;

import java.util.Date;

/**
 * @description t_user
 * @author ******
 */
@Data
public class UserVo extends BaseValue {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Long id;

    /**
     * 账号
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

}
