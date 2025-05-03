package tech.makridakis.devfoliobackend.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.makridakis.devfoliobackend.model.ProjectEntity;
import tech.makridakis.devfoliobackend.payload.ProjectResponseDTO;
import tech.makridakis.devfoliobackend.repository.IProjectRepository;
import tech.makridakis.devfoliobackend.repository.IToolRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProjectService {

    private final IProjectRepository projectRepository;
    private final IToolRepository toolRepository;
    private final ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public List<ProjectResponseDTO> getAllProjects() {
        List<ProjectEntity> projectEntities = projectRepository.findAll();

        return projectEntities.stream()
                .map(entity -> modelMapper.map(entity, ProjectResponseDTO.class))
                .toList();
    }


}
