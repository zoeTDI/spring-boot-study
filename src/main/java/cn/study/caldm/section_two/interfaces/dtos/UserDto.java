package cn.study.caldm.section_two.interfaces.dtos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.study.caldm.section_two.domain.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDto {
    // @JsonIgnore // 忽略
    @JsonProperty ("user_id") // 重命名
    private Long id;
    private String name;
    private String email;
    // @JsonInclude (JsonInclude.Include.NON_NULL) // 排除 null
    // private String phoneNumber;
    // @JsonFormat (pattern = "yyyy-MM-dd HH:mm:ss") // 格式化
    // private LocalDateTime createAt;
}
