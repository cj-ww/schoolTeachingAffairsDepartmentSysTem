package com.stads.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cyz
 * @date 2020-10-22 9:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 管理员id
     */
    private Integer id;
    /**
     * 管理员姓名
     */
    private String username;
    /**
     * 管理员密码
     */
    private String password;
    /**
     * 管理员邮箱
     */
    private String email;
}
