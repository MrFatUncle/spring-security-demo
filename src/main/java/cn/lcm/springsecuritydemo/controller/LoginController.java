/**
 * FileName: LoginController
 * Author:   liaocm
 * Date:     2020/4/13 15:57
 * Description:
 * History:
 */
package cn.lcm.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class LoginController {

    @GetMapping("/oauth/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
