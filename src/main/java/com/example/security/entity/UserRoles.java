package com.example.security.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRoles {

    @EmbeddedId
    private UserRoleId id;  // 복합키

    @ManyToOne
    @MapsId("userId") // UserRoleId의 userId와 매핑
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @MapsId("roleId") // UserRoleId의 roleId와 매핑
    @JoinColumn(name = "role_id")
    private Roles role;
}
