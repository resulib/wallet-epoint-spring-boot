package com.epoint.walletepoint.entity;

import com.epoint.walletepoint.service.impl.enums.RoleType;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "roles")
public class RoleEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleType name;
}
