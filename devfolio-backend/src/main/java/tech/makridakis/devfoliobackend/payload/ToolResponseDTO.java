package tech.makridakis.devfoliobackend.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ToolResponseDTO {
    @Schema(description = "Unique identifier of the tool", example = "101")
    private long id;

    @Schema(description = "Name or title of the tool", example = "Spring Boot", requiredMode = Schema.RequiredMode.REQUIRED)
    private String title;
}

