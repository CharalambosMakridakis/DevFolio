package tech.makridakis.devfoliobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.makridakis.devfoliobackend.model.ProjectEntity;

@Repository
public interface IProjectRepository extends JpaRepository<ProjectEntity, Long> {
}
