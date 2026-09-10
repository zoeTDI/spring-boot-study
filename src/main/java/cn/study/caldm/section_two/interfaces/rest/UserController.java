package cn.study.caldm.section_two.interfaces.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.study.caldm.section_two.application.service.UserService;
import cn.study.caldm.section_two.domain.model.User;
import cn.study.caldm.section_two.interfaces.dtos.UserDto;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    // @RequestMapping ("/users")
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<User> dos = userService.findAll();
        if (dos == null || dos.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(UserDto.toDtoList(dos));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable("id") Long id) {
        User user = userService.getUser(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(UserDto.toDto(user));
    }

}
