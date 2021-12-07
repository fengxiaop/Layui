package com.qr.anti.vo;

import com.qr.anti.base.BaseValue;
import lombok.Data;

@Data
public class LoginVo extends BaseValue {

    private String userName;

    private String password;
}
