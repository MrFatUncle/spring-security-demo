/**
 * FileName: OauthClient
 * Author:   liaocm
 * Date:     2020/4/14 16:54
 * Description: Oauth2的客户端
 * History:
 */
package cn.lcm.ssoserver.base.model;

import lombok.Data;

@Data
public class OauthClient {

    /**
     * id
     */
    private Long id;
    /**
     * 客户端id
     */
    private String clientId;
    /**
     * 密码
     */
    private String password;
}
