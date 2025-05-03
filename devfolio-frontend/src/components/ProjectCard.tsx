import { motion } from "motion/react"; // Import motion for animations
import { ProjectData } from "../interfaces/IProject"; // Import the project data interface

// Displays a single project card with details and animations
function ProjectCard({
  id,
  title,
  description,
  repositoryUrl,
  tools,
}: ProjectData) {
  return (
    <motion.div
      key={id}
      className="border-accent outline-background shadow-secondary rounded-t-md border-3 border-t-6 bg-black/5 p-6 shadow-md outline-2 outline-offset-1 lg:max-w-1/5 cursor-pointer"
      initial={{ opacity: 0, scale: 0.8 }}
      whileInView={{
        opacity: 1,
        scale: 1,
        transition: { duration: 1 },
      }}
      whileHover={{
        scale: 1.05,
        transition: { duration: 0.2 },
      }}
      onClick={() => {
        if (!repositoryUrl) return;
        window.open(repositoryUrl, "_blank");
      }}
    >
      <div className="flex flex-col gap-5">
        {/* Project Title */}
        <p className="text-primary text-2xl font-bold">{title}</p>
        {/* Project Description */}
        <p className="">{description}</p>
        <p className="text-primary font-bold underline underline-offset-2">
          Tools:
        </p>
      </div>
      {/* Display list of tools used */}
      <div className="flex flex-wrap gap-2">
        {tools.map(({ id, title }) => (
          <p key={id}>{title}</p>
        ))}
      </div>
    </motion.div>
  );
}

export default ProjectCard;
