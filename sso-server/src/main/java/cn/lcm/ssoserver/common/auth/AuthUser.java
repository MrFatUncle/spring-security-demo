/**
 * FileName: AuthUser
 * Author:   liaocm
 * Date:     2020/4/13 15:54
 * Description:
 * History:
 */
package cn.lcm.ssoserver.common.auth;

import lombok.Data;

@Data
public class AuthUser {

    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;

}
