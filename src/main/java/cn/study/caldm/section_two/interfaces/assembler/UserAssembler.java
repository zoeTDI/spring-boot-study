package cn.study.caldm.section_two.interfaces.assembler;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import cn.study.caldm.section_two.domain.model.User;
import cn.study.caldm.section_two.infrastructure.persistence.po.UserPO;
import cn.study.caldm.shared_kernel.base.BaseAssembler;

@Component 
public class UserAssembler implements BaseAssembler<User, UserPO> {

    @Override
    public User toDomain(UserPO po) {
        User domain = new User();
        domain.setId(po.getId());
        domain.setName(po.getName());
        domain.setEmail(po.getEmail());
        domain.setPassword(po.getPassword());
        domain.setAddresses(new ArrayList<>());
        domain.setProfile("");
        domain.setFavoriteProducts(new ArrayList<>());
        return domain;
    }

    @Override
    public UserPO toPo(User domain) {
        UserPO po = new UserPO();
        po.setId(domain.getId());
        po.setName(domain.getName());
        po.setEmail(domain.getEmail());
        po.setPassword(domain.getPassword());
        return po;
    }

}
