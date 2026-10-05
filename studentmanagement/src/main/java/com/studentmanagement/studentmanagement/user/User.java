package com.studentmanagement.studentmanagement.user;

import jakarta.persistence.*;

@Entity
@Table(
    name = "users",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "email")
    }
)

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}