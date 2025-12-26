package com.epoint.walletepoint.mapper;

import com.epoint.walletepoint.dto.UserDto;
import com.epoint.walletepoint.entity.RoleEntity;
import com.epoint.walletepoint.entity.UserEntity;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(UserEntity user);

    default Set<String> mapRoles(Set<RoleEntity> roles) {
        return roles.stream()
                .map(role -> role.getName().name())
                .collect(Collectors.toSet());
    }
}
