package cn.study.caldm.section_two.infrastructure.persistence.mapper;

import org.mapstruct.Mapper;

import cn.study.caldm.section_two.domain.model.User;
import cn.study.caldm.section_two.interfaces.dtos.UserDto;


@Mapper (componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
