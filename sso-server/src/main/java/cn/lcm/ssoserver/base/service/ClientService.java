/**
 * FileName: ClientService
 * Author:   liaocm
 * Date:     2020/4/14 16:52
 * Description: 配置Oauth2客户端client的Service
 * History:
 */
package cn.lcm.ssoserver.base.service;

import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;

public interface ClientService {

    /**
     * 配置客户端
     * @param clients
     * @return
     */
    ClientDetailsServiceConfigurer addClients(ClientDetailsServiceConfigurer clients);
}
