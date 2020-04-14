/**
 * FileName: ClientServiceImpl
 * Author:   liaocm
 * Date:     2020/4/14 16:53
 * Description:
 * History:
 */
package cn.lcm.ssoserver.base.service.impl;

import cn.lcm.ssoserver.base.service.ClientService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Override
    public ClientDetailsServiceConfigurer addClients(ClientDetailsServiceConfigurer clients) {
        return null;
    }
}
