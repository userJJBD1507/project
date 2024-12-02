package com.project.id.project.Entities;

import jakarta.persistence.*;
import org.apache.catalina.LifecycleState;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "roles_table")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "roleName")
    private String roleName; //User, Admin
    @OneToMany(mappedBy = "role")
    private List<YandexIdCloneEntity> yandexIdCloneEntities = new ArrayList<>();
    @ManyToMany
    private Set<Permission> permissionSet = new HashSet<>();

    public Roles(Set<Permission> permissionSet) {
        this.permissionSet = permissionSet;
    }

    public Set<Permission> getPermissionSet() {
        return permissionSet;
    }

    public void setPermissionSet(Set<Permission> permissionSet) {
        this.permissionSet = permissionSet;
    }

    public Roles(List<YandexIdCloneEntity> yandexIdCloneEntities) {
        this.yandexIdCloneEntities = yandexIdCloneEntities;
    }

    public List<YandexIdCloneEntity> getYandexIdCloneEntities() {
        return yandexIdCloneEntities;
    }

    public void setYandexIdCloneEntities(List<YandexIdCloneEntity> yandexIdCloneEntities) {
        this.yandexIdCloneEntities = yandexIdCloneEntities;
    }

    public Roles() {
    }

    public Roles(String roleName) {
        this.roleName = roleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}