/**
 * FileName: AuthServiceImpl
 * Author:   liaocm
 * Date:     2020/4/15 11:07
 * Description:
 * History:
 */
package cn.lcm.ssoserver.base.service.impl;

import cn.lcm.ssoserver.base.model.AuthUser;
import cn.lcm.ssoserver.base.service.IAuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service("authService")
public class AuthServiceImpl implements IAuthService, UserDetailsService {

    private static final Map<String, AuthUser> users = new HashMap<>();

    static{
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("all"));
        users.put("user1", new AuthUser("user1", encoder.encode("123456"), authorities));
        users.put("user2", new AuthUser("user2", encoder.encode("12345678"), authorities));

    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(users.get(username) == null) {
            throw new UsernameNotFoundException(username);
        }
        return users.get(username);
    }
}
