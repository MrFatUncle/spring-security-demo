/**
 * FileName: Role
 * Author:   liaocm
 * Date:     2020/4/15 10:52
 * Description:
 * History:
 */
package cn.lcm.ssoserver.base.model;

import lombok.Data;

@Data
public class Role {

    private Long id;
    /**
     * 角色名称
     */
    private String roleName;

}
