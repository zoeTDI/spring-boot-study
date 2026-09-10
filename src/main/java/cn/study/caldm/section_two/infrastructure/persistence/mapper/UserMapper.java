package cn.study.caldm.section_two.infrastructure.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import cn.study.caldm.section_two.domain.model.User;
import cn.study.caldm.section_two.interfaces.dtos.UserDto;


@Mapper (componentModel = "spring")
public interface UserMapper {
    // @Mapping (target = "createAt", expression = "java(java.time.LocalDateTime.now())")
    UserDto toDto(User user);
}
