package com.example.medicineservice.domain.mapper;

import com.example.medicineservice.data.entity.UserInfo;
import com.example.medicineservice.domain.dto.UserUpdateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserInfoMapper {

    UserInfo updateUserInfoFromRequest(UserUpdateRequest request, @MappingTarget UserInfo userInfo);
}

