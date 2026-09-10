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

    public static UserDto toDto(User user) {
        if (user == null) {
            return null;
        }
        return new UserDto(user.getId(), user.getName(), user.getEmail());
    }

    public static List<UserDto> toDtoList(List<User> userList) {
        if (userList == null || userList.isEmpty()) {
            return new ArrayList<>();
        }
        return userList.stream()
                .map(user -> UserDto.toDto(user))
                .toList();
    }
}
