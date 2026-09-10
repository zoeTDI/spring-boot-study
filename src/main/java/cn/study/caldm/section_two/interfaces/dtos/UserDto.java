package cn.study.caldm.section_two.interfaces.dtos;

import java.util.ArrayList;
import java.util.List;

import cn.study.caldm.section_two.domain.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
}
