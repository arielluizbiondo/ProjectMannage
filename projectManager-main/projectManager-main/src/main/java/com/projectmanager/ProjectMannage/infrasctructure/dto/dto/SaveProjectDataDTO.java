package com.projectmanager.ProjectMannage.infrasctructure.dto.dto;

import lombok.Data;
import java.time.LocalDate;
@Data
public class SaveProjectDataDTO {
    private final String name;
    private final String description;
    private final LocalDate initialData;
    private final LocalDate finalDate;
    private final String status;
}
