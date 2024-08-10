package com.example.SpringBootPostgres.data.entity;

import com.example.SpringBootPostgres.data.dto.UserDto;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // Constructor vacío requerido por JPA
    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(UserDto userDto) {
        this.name = userDto.getName(); // Asigna el nombre desde el UserDto
        this.email = userDto.getEmail(); // Asigna el email desde el UserDto
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
