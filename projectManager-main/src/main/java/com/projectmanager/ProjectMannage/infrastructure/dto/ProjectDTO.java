package com.projectmannage.ProjetMannage.infrastructure.dto;

import lombok.Data;
import java.time.LocalDate;

/*
(@Getter / @Setter)
= @Data funciona igual Getter and Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
*/

@Data
@Builder

public class Project 
{
    private final String id;
    private final String name;
    private final String description;
    private final LocalDate finalDate;
    private final ProjectStatus status;
    private final LocalDate initialDate;

    public static ProjectDTO create(Project Project)
    {
        return new ProjectDTO
        (
            Project.getId(),
            Project.getName(),
            Project.getDescription(),
            Project.getInitialDate(),
            Project.getFinalDate(),
            Project.getStatus()
        )
    }
}
