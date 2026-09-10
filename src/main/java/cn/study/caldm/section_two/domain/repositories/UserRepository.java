package cn.study.caldm.section_two.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.study.caldm.section_two.infrastructure.persistence.po.UserPO;

public interface UserRepository extends JpaRepository<UserPO, Long> {
}
