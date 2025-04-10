package com.wp.lab13;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Min;

public class UserRequestDTO {
    @NotNull(message = "Field can not be null")
    @Size(min = 2, max = 30, message = "Name cannot be this size")
    private String name;

    @NotNull(message = "Field cannot be null")
    @Min(value = 0, message = "Age can not be less than 0")
    private int age;

    UserRequestDTO () {
    };

    UserRequestDTO (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
