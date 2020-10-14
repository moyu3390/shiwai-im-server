package com.im.imserver.convertor;

import com.im.imserver.domain.user.Role;
import com.im.imserver.domain.user.UserProfile;
import com.im.imserver.dto.clientobject.UserProfileCO;
import com.im.imserver.gatewayimpl.database.dataobject.UserProfileDO;
import org.springframework.beans.BeanUtils;

public class UserProfileConvertor{

    public static UserProfile toEntity(UserProfileCO userProfileCO){
        UserProfile userProfile = new UserProfile();
        BeanUtils.copyProperties(userProfileCO, userProfile);
        userProfile.setRole(Role.valueOf(userProfileCO.getRole()));
        return userProfile;
    }

    public static UserProfileDO toDataObject(UserProfile userProfile){
        UserProfileDO userProfileDO = new UserProfileDO();
        BeanUtils.copyProperties(userProfile, userProfileDO);
        userProfileDO.setRole(userProfile.getRole().name());
        return userProfileDO;
    }

    public static UserProfileDO toDataObjectForCreate(UserProfile userProfile){
        UserProfileDO userProfileDO = toDataObject(userProfile);
        return userProfileDO;
    }

    public static UserProfileDO  toDataObjectForUpdate(UserProfile userProfile){
        UserProfileDO userProfileDO = toDataObject(userProfile);
        return userProfileDO;
    }
}
