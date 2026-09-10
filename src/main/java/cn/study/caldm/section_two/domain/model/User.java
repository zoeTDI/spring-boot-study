package cn.study.caldm.section_two.domain.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<String> addresses;
    private String profile;
    private List<String> favoriteProducts;
}
