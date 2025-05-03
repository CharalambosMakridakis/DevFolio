package tech.makridakis.devfoliobackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "tool")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "t_id")
    private long id;

    @Column(name = "title", nullable = false, unique = true)
    private String title;
}
