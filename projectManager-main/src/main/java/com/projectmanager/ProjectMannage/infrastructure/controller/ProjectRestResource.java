
@RestController
@RequestMapping("PATH_CONSTANTS")
public class ProjectRestResource
{
    private final ProjectService ProjectService;

    public ResponseEntity<ProjectDTO> createProject(@RequestBody SaveProjectDataDTO SaveProjectDataDTO)
    {
        ProjectService.createProject(SaveProjectDataDTO);

        Project Project = Project.createProject(SaveProjectDataDTO);
        return ResponseEntity.created(URI.create("PATH_CONSTANTS"+Project.getId())).body(ProjectDTO.create(Project));
    }
}