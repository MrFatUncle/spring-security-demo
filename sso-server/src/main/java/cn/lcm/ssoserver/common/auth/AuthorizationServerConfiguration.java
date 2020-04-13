/**
 * FileName: AuthorizationServerConfiguration
 * Author:   liaocm
 * Date:     2020/4/13 15:28
 * Description:
 * History:
 */
package cn.lcm.ssoserver.common.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

@Configuration
@EnableAuthorizationServer
class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    TokenStore tokenStore;

    @Autowired
    BCryptPasswordEncoder encoder;

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //配置客户端
        clients
                .inMemory()
                .withClient(Config.CLIENT_ID)
                .secret(encoder.encode(Config.PASSWORD)).resourceIds("hi")
                .authorizedGrantTypes(Config.GRANT_TYPE_PWD, Config.GRANT_TYPE_RT)
                .scopes("read");
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints
                .tokenStore(tokenStore)
                .authenticationManager(authenticationManager);
    }


    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
        //允许表单认证
        oauthServer
                .allowFormAuthenticationForClients()
                .checkTokenAccess("permitAll()")
                .tokenKeyAccess("permitAll()");
    }

    private static final class Config {

        private static final String CLIENT_ID = "myClient";
        private static final String PASSWORD = "123456";

        private static final String GRANT_TYPE_PWD = "password";
        private static final String GRANT_TYPE_RT = "refresh_token";


    }
}