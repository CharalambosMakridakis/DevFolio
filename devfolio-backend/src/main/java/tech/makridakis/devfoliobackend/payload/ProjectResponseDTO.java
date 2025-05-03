package tech.makridakis.devfoliobackend.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProjectResponseDTO {
    @Schema(description = "Unique identifier of the project", example = "1")
    private long id;

    @Schema(description = "Title or name of the project", example = "My Awesome Project", requiredMode = Schema.RequiredMode.REQUIRED)
    private String title;

    @Schema(description = "Detailed description of the project", example = "A web app...", requiredMode = Schema.RequiredMode.REQUIRED)
    private String description;

    @Schema(description = "URL of the project's code repository", example = "https://github.com/user/repo")
    private String repositoryUrl;

    @Schema(description = "Set of tools associated with the project")
    private Set<ToolResponseDTO> tools;
}
