package com.epoint.walletepoint.repository;

import com.epoint.walletepoint.entity.RoleEntity;
import com.epoint.walletepoint.service.impl.enums.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    Optional<RoleEntity> findByName(RoleType name);
}