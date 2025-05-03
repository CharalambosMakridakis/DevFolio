package tech.makridakis.devfoliobackend;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tech.makridakis.devfoliobackend.controller.ProjectController;
import tech.makridakis.devfoliobackend.model.ProjectEntity;
import tech.makridakis.devfoliobackend.model.ToolEntity;
import tech.makridakis.devfoliobackend.repository.IProjectRepository;
import tech.makridakis.devfoliobackend.repository.IToolRepository;

@Component
@RequiredArgsConstructor
public class DatabaseInitializer implements ApplicationRunner {

    private final IProjectRepository projectRepository;
    private final IToolRepository toolRepository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) {
        if (projectRepository.count() == 0 && toolRepository.count() == 0) {
            System.out.println("Initialize Database...");

            // DevOps Projekt
            ToolEntity docker = toolRepository.save(ToolEntity.builder().title("Docker").build());
            ToolEntity traefik = toolRepository.save(ToolEntity.builder().title("Traefik").build());
            ToolEntity prometheus = toolRepository.save(ToolEntity.builder().title("Prometheus").build());
            ToolEntity sonarqube = toolRepository.save(ToolEntity.builder().title("SonarQube").build());
            ToolEntity gitlabCi = toolRepository.save(ToolEntity.builder().title("GitLab CI").build());
            ToolEntity nginx = toolRepository.save(ToolEntity.builder().title("NGINX").build());

            ProjectEntity devOps = ProjectEntity.builder()
                    .title("Realtime Chat")
                    .description("'Strix' is a real-time chat app that allows users to communicate with each other. " +
                            "I configured the DevOps pipeline.")
                    .repositoryUrl("https://github.com/CharalambosMakridakis/THM__2021-2025/tree/main/ChatApp_DevOps")
                    .build();
            devOps.addTool(docker);
            devOps.addTool(traefik);
            devOps.addTool(prometheus);
            devOps.addTool(sonarqube);
            devOps.addTool(gitlabCi);
            devOps.addTool(nginx);
            projectRepository.save(devOps);

            // Vehicle Space Rental Projekt
            ToolEntity react = toolRepository.save(ToolEntity.builder().title("React").build());
            ToolEntity typescript = toolRepository.save(ToolEntity.builder().title("TypeScript").build());
            ToolEntity vite = toolRepository.save(ToolEntity.builder().title("Vite").build());
            ToolEntity bootstrap = toolRepository.save(ToolEntity.builder().title("Bootstrap").build());
            ToolEntity eslint = toolRepository.save(ToolEntity.builder().title("ESLint").build());
            ToolEntity prettier = toolRepository.save(ToolEntity.builder().title("Prettier").build());

            ProjectEntity vehicleSpaceRental = ProjectEntity.builder()
                    .title("Vehicle Space Rental")
                    .description("A web application that allows users to rent and offer vehicle spaces. " +
                            "I developed the frontend.")
                    .repositoryUrl("https://github.com/CharalambosMakridakis/THM__2021-2025/tree/main/Lagervermittlung_SoftwaretechnikProjekt")
                    .build();
            vehicleSpaceRental.addTool(react);
            vehicleSpaceRental.addTool(typescript);
            vehicleSpaceRental.addTool(vite);
            vehicleSpaceRental.addTool(bootstrap);
            vehicleSpaceRental.addTool(eslint);
            vehicleSpaceRental.addTool(prettier);
            projectRepository.save(vehicleSpaceRental);

            // KMS Cargonaut Projekt
            ToolEntity pocketbase = toolRepository.save(ToolEntity.builder().title("PocketBase").build());
            ToolEntity materialUI = toolRepository.save(ToolEntity.builder().title("Material UI").build());
            // Bootstrap, React, Vite, Prettier, ESLInt, TypeScript

            ProjectEntity cargonaut = ProjectEntity.builder()
                    .title("Ride Sharing")
                    .description("A web application that allows users to share and participate in rides. " +
                            "I developed the homepage.")
                    .repositoryUrl("https://github.com/CharalambosMakridakis/THM__2021-2025/tree/main/Mitfahrvermittlung_KonzepteModernerSE")
                    .build();
            cargonaut.addTool(pocketbase);
            cargonaut.addTool(materialUI);
            cargonaut.addTool(bootstrap);
            cargonaut.addTool(react);
            cargonaut.addTool(vite);
            cargonaut.addTool(prettier);
            cargonaut.addTool(eslint);
            cargonaut.addTool(typescript);
            projectRepository.save(cargonaut);

            // TIC TAC TOE Projekt
            ToolEntity sqlite3 = toolRepository.save(ToolEntity.builder().title("SQLite3").build());
            ToolEntity swagger = toolRepository.save(ToolEntity.builder().title("Swagger").build());
            ToolEntity typeorm = toolRepository.save(ToolEntity.builder().title("TypeORM").build());
            ToolEntity nestjs = toolRepository.save(ToolEntity.builder().title("NestJS").build());
            // TypeScript

            ProjectEntity tictactoe = ProjectEntity.builder()
                    .title("Competitive Tic Tac Toe")
                    .description("A web application that allows users to play Tic Tac Toe competitively. " +
                            "I developed the match logic in the backend.")
                    .repositoryUrl("https://github.com/CharalambosMakridakis/THM__2021-2025/tree/main/TicTacToeMatchmaking_WebbasierteSysteme2")
                    .build();
            tictactoe.addTool(sqlite3);
            tictactoe.addTool(swagger);
            tictactoe.addTool(typeorm);
            tictactoe.addTool(nestjs);
            tictactoe.addTool(typescript);
            projectRepository.save(tictactoe);

            // Containerisierung Modul
            ToolEntity mariadb = toolRepository.save(ToolEntity.builder().title("MariaDB").build());
            ToolEntity adminer = toolRepository.save(ToolEntity.builder().title("Adminer").build());
            ToolEntity vue = toolRepository.save(ToolEntity.builder().title("Vue.js").build());
            ToolEntity kaniko = toolRepository.save(ToolEntity.builder().title("Kaniko").build());
            // NGINX, GitLab CI, Docker, Traefik

            ProjectEntity dockerization = ProjectEntity.builder()
                    .title("ToDo Dockerization")
                    .description("A web application that allows users to manage their tasks. " +
                            "I containerized the application.")
                    .repositoryUrl("https://github.com/CharalambosMakridakis/THM__2021-2025/tree/main/ToDo_ContainerisierteAnwendung")
                    .build();
            dockerization.addTool(mariadb);
            dockerization.addTool(adminer);
            dockerization.addTool(vue);
            dockerization.addTool(kaniko);
            dockerization.addTool(nginx);
            dockerization.addTool(gitlabCi);
            dockerization.addTool(docker);
            dockerization.addTool(traefik);
            projectRepository.save(dockerization);

            // DevFolio
            ToolEntity springBoot = toolRepository.save(ToolEntity.builder().title("Spring Boot").build());
            ToolEntity java = toolRepository.save(ToolEntity.builder().title("Java").build());
            ToolEntity tailwindcss = toolRepository.save(ToolEntity.builder().title("TailwindCSS").build());
            // React, TypeScript, Vite, Prettier, ESLint, Swagger, Docker, NGINX

            ProjectEntity devfolio = ProjectEntity.builder()
                    .title("Devfolio")
                    .description("The web application you're using right now.")
                    .repositoryUrl("https://github.com/CharalambosMakridakis/DevFolio")
                    .build();
            devfolio.addTool(springBoot);
            devfolio.addTool(java);
            devfolio.addTool(tailwindcss);
            devfolio.addTool(react);
            devfolio.addTool(typescript);
            devfolio.addTool(vite);
            devfolio.addTool(prettier);
            devfolio.addTool(eslint);
            devfolio.addTool(swagger);
            devfolio.addTool(docker);
            devfolio.addTool(nginx);
            projectRepository.save(devfolio);

            // EDI-Converter
            ToolEntity openui5 = toolRepository.save(ToolEntity.builder().title("OpenUI5").build());

            ProjectEntity ediConverter = ProjectEntity.builder()
                    .title("EDI-Converter Configuration")
                    .description("A web application that allows users to configure the edi-converter. " +
                            "I developed the frontend.")
                    .repositoryUrl("")
                    .build();

            ediConverter.addTool(openui5);
            projectRepository.save(ediConverter);


            System.out.println("Database initialized.");
        }
    }
}
