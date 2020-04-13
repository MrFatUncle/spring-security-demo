/**
 * FileName: UserController
 * Author:   liaocm
 * Date:     2020/4/13 18:00
 * Description:
 * History:
 */
package cn.lcm.springsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("getUserName")
    public String getUserName() {
        return "my username is...";
    }
}
