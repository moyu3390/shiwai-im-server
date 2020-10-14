package com.im.imserver.command;

import com.alibaba.cola.dto.Response;
import com.im.imserver.convertor.UserProfileConvertor;
import com.im.imserver.domain.user.UserProfile;
import com.im.imserver.dto.UserProfileAddCmd;
import com.im.imserver.domain.gateway.UserProfileGateway;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * UserProfileAddCmdExe
 *
 * @author Frank Zhang
 * @date 2019-02-28 6:25 PM
 */
@Component
public class UserProfileAddCmdExe{

    @Resource
    private UserProfileGateway userProfileGateway;

    public Response execute(UserProfileAddCmd cmd) {
        UserProfile userProfile = UserProfileConvertor.toEntity(cmd.getUserProfileCO());
        userProfileGateway.create(userProfile);
        return Response.buildSuccess();
    }
}
