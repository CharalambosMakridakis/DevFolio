package tech.makridakis.devfoliobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.makridakis.devfoliobackend.model.ToolEntity;

@Repository
public interface IToolRepository extends JpaRepository<ToolEntity, Long> {
}
