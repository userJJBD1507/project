package com.project.id.project.Entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "clients_data")
public class YandexIdCloneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "userId")
    private UUID userId;
    @Column(name = "email")
    private String email;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "passwordHash")
    private String passwordHash;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "registrationDate")
    private LocalDateTime registrationDate;
    @Column(name = "lastLoginDate")
    private LocalDateTime lastLoginDate;
    @Column(name = "accountStatus")
    private AccountStatus accountStatus;
    @ManyToOne
    @JoinColumn(name = "record_roles_id")
    private Roles role;
    @Column(name = "notificationSettings")
    private NotificationSettings notificationSettings;

    public YandexIdCloneEntity() {
    }

    public YandexIdCloneEntity(Roles role) {
        this.role = role;
    }

    public YandexIdCloneEntity(UUID userId,
                               String email,
                               String phoneNumber,
                               String passwordHash,
                               String firstName,
                               String lastName,
                               LocalDateTime registrationDate,
                               LocalDateTime lastLoginDate,
                               AccountStatus accountStatus,
                               NotificationSettings notificationSettings) {
        this.userId = userId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.passwordHash = passwordHash;
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationDate = registrationDate;
        this.lastLoginDate = lastLoginDate;
        this.accountStatus = accountStatus;
        this.notificationSettings = notificationSettings;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalDateTime getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDateTime lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public NotificationSettings getNotificationSettings() {
        return notificationSettings;
    }

    public void setNotificationSettings(NotificationSettings notificationSettings) {
        this.notificationSettings = notificationSettings;
    }

    @Override
    public String toString() {
        return "YandexIdCloneEntity{" +
                "id=" + id +
                ", userId=" + userId +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registrationDate=" + registrationDate +
                ", lastLoginDate=" + lastLoginDate +
                ", accountStatus=" + accountStatus +
                ", role='" + role + '\'' +
                ", notificationSettings=" + notificationSettings +
                '}';
    }
}

enum AccountStatus {
    ACTIVE,
    BLOCKED,
    DELETED
}

@Embeddable
class NotificationSettings {
    private boolean emailNotifications;
    private boolean smsNotifications;

    public boolean isEmailNotifications() {
        return emailNotifications;
    }

    public void setEmailNotifications(boolean emailNotifications) {
        this.emailNotifications = emailNotifications;
    }

    public boolean isSmsNotifications() {
        return smsNotifications;
    }

    public void setSmsNotifications(boolean smsNotifications) {
        this.smsNotifications = smsNotifications;
    }
}