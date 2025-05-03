import { useEffect, useState } from "react";
import ProjectCard from "../components/ProjectCard";
import { ProjectData } from "../interfaces/IProject";
import axios from "axios";

/**
 * Renders a list of projects fetched from an API.
 */
function Project() {
  const [projects, setProjects] = useState<ProjectData[]>([]);

  // Fetch projects from the API when the component mounts
  useEffect(() => {
    const fetchProjects = async (): Promise<void> => {
      try {
        const response = await axios.get("/api/v1/projects");
        setProjects(response.data);
      } catch (error) {
        console.error("Error fetching projects:", error);
      }
    };

    fetchProjects();
  }, []);

  return (
    <div className="flex flex-wrap gap-10">
      {projects.length === 0 ? (
        <p>No projects found.</p>
      ) : (
        // Map over the projects array and render a ProjectCard for each project
        projects.map((project) => (
          <ProjectCard
            key={project.id}
            id={project.id}
            title={project.title}
            description={project.description}
            repositoryUrl={project.repositoryUrl}
            tools={project.tools}
          />
        ))
      )}
    </div>
  );
}

export default Project;
