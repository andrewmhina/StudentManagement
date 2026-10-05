package com.studentmanagement.studentmanagement.user;

public class UserResponse {

    private Long id;
    private String username;
    private String email;
    private Role role;

    public UserResponse() {
    }

    public UserResponse(Long id, String username, String email, Role role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.role = role;
    }
}