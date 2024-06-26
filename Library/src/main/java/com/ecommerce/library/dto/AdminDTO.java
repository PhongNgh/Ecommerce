package com.ecommerce.library.dto;


import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class AdminDTO {
    @Size(min = 3, max = 10, message = "Invalid first name!")
    private String firstName;
    @Size(min = 3, max = 10, message = "Invalid last name!")
    private String lastName;

    private String username;
    @Size(min = 8, max = 15, message = "Invalid password")
    private String password;

    private String repeatPassword;
}
