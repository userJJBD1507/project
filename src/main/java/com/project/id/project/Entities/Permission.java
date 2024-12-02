package com.project.id.project.Entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "permission")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "permissionName")
    private String permissionName; // Read, Write, Delete
    @ManyToMany
    @JoinTable(name = "roles_permissions_connection",
            joinColumns = @JoinColumn(name = "permission_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Roles> rolesSet = new HashSet<>();

    public Permission() {
    }

    public Permission(Set<Roles> rolesSet) {
        this.rolesSet = rolesSet;
    }

    public Set<Roles> getRolesSet() {
        return rolesSet;
    }

    public void setRolesSet(Set<Roles> rolesSet) {
        this.rolesSet = rolesSet;
    }

    public Permission(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permissionName='" + permissionName + '\'' +
                '}';
    }
}