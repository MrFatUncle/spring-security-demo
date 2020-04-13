/**
 * FileName: UserController
 * Author:   liaocm
 * Date:     2020/4/13 17:00
 * Description:
 * History:
 */
package cn.lcm.ssoclient.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/hi")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> hi() {
        return ResponseEntity.ok().body("auth success!");
    }
}
