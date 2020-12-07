package com.schoolofnet.QueryDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String name;
    private Integer age;

    public UserDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
