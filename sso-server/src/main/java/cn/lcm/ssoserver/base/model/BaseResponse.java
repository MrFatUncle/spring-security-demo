/**
 * FileName: BaseResponse
 * Author:   liaocm
 * Date:     2020/4/15 14:21
 * Description:
 * History:
 */
package cn.lcm.ssoserver.base.model;

import lombok.Data;

@Data
public class BaseResponse {

    private Object data;

    private Integer status;

    public static BaseResponse success(Object data) {
        BaseResponse baseResponse = new BaseResponse();

        baseResponse.setData(data);
        baseResponse.setStatus(Code.SUCCESS.value);

        return baseResponse;
    }


    public enum Code {
        /**
         * 成功200
         *
         */
        SUCCESS(200), NOT_FOUND(404), ERROR(500), UN_AUTH(401);

        private Integer value;

        private Code(Integer value) {
            this.value = value;
        }
    }
}
