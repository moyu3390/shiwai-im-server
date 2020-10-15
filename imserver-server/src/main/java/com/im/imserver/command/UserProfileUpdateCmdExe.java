package com.im.imserver.command;

import com.alibaba.cola.dto.Response;
import com.im.imserver.convertor.UserProfileConvertor;
import com.im.imserver.domain.user.UserProfile;
import com.im.imserver.dto.UserProfileUpdateCmd;
import com.im.imserver.domain.gateway.UserProfileGateway;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserProfileUpdateCmdExe{

    @Resource
    private UserProfileGateway userProfileGateway;

    public Response execute(UserProfileUpdateCmd cmd) {
        UserProfile userProfile = UserProfileConvertor.toEntity(cmd.getUserProfileCO());
        userProfileGateway.update(userProfile);
        return Response.buildSuccess();
    }
}