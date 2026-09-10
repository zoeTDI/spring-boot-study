package cn.study.caldm.section_two.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cn.study.caldm.section_two.domain.model.User;
import cn.study.caldm.section_two.domain.repositories.UserRepository;
import cn.study.caldm.section_two.infrastructure.persistence.po.UserPO;
import cn.study.caldm.section_two.interfaces.assembler.UserAssembler;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    private final UserAssembler assembler;

    public List<User> findAll() {
        List<UserPO> pos = userRepository.findAll();
        return assembler.toDomainList(pos);
    }

    public User getUser(Long id) {
        System.out.println("id: " + id);
        if (id == null) {
            return null;
        }
        Optional<UserPO> byId = userRepository.findById(id);
        if (byId.isEmpty()) {
            return null;
        }
        return assembler.toDomain(byId.get());
    }
}
