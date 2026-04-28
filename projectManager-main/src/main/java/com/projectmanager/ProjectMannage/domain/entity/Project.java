package com.projectmanager.ProjectMannage.domain.entity;
import com.projectmanager.ProjectMannage.model.ProjectStatus;
import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Builder
/*
(@Getter / @Setter)
= @Data funciona igual Getter and Setter
*/
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Project {

    private String id;
    private String name;
    private String description;
    private LocalDate initial_date;
    private LocalDate final_date;
    private ProjectStatus status;

}
