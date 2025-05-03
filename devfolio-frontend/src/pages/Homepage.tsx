import Landing from "../sections/Landing"; // Import the Landing component
import Project from "../sections/Project"; // Import the Project component

const Homepage = () => {
  return (
    <>
      {/* Landing section */}
      <section
        className="text-text h-screen w-full overflow-hidden bg-gray-800 p-10 md:p-20 lg:p-40"
        id="home"
      >
        <Landing />
      </section>
      {/* Projects section */}
      <section
        className="text-text lg:h-screen lg:w-full lg:overflow-hidden bg-gray-800 p-10 md:p-20 lg:p-40"
        id="projects"
      >
        <Project />
      </section>
    </>
  );
};

export default Homepage;
