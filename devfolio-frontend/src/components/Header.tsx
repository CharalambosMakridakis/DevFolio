import { gsap } from "gsap";
import { useGSAP } from "@gsap/react";
import { TextPlugin } from "gsap/TextPlugin";
import { ScrollToPlugin } from "gsap/ScrollToPlugin";
import { useRef, useState } from "react";
import { useLocation, useNavigate } from "react-router";

gsap.registerPlugin(useGSAP, TextPlugin, ScrollToPlugin);

function Header() {
  const [isHovered, setIsHovered] = useState<boolean>(false);
  const refC = useRef(null);
  const refM = useRef(null);
  const location = useLocation();
  const navigate = useNavigate();

  // GSAP animation for name text change on hover
  useGSAP(() => {
    const textC = isHovered ? "Charalambos " : "C. ";
    const textM = isHovered ? "Makridakis" : "M.";

    gsap.to(refC.current, {
      text: textC,
      duration: 1,
      ease: "none",
    });

    gsap.to(refM.current, {
      text: textM,
      duration: 1,
      ease: "none",
    });
  }, [isHovered]);

  // Handles click on the name/home button: navigates to root and scrolls to top
  const handleHomeClick = () => {
    if (location.pathname !== "/") {
      navigate("/");
    }
    gsap.to(window, {
      duration: 0.7,
      scrollTo: 0,
    });
  };

  // Handles click on the projects button: navigates to root and scrolls to projects section
  const handleProjectsClick = () => {
    if (location.pathname !== "/") {
      navigate("/");
    }
    gsap.to(window, {
      duration: 0.7,
      scrollTo: "#projects",
    });
  };

  return (
    <>
      <header className="border-accent sticky top-0 border-b-1 bg-gray-900 py-3">
        <nav className="text-text flex flex-wrap justify-center gap-12 text-3xl font-bold md:text-2xl lg:text-2xl">
          {/* Name button with hover animation */}
          <button
            className="text-primary cursor-pointer"
            onMouseEnter={() => setIsHovered(true)}
            onMouseLeave={() => setIsHovered(false)}
            onClick={handleHomeClick}
          >
            <span ref={refC}>C.</span>
            <span ref={refM}>M.</span>
          </button>
          {/* Home navigation button */}
          <button
            className="decoration-accent cursor-pointer decoration-4 underline-offset-6 transition-all duration-200 ease-in-out hover:underline hover:underline-offset-2"
            onClick={handleHomeClick}
          >
            Home
          </button>
          {/* Projects navigation button */}
          <button
            className="decoration-accent cursor-pointer decoration-4 underline-offset-6 transition-all duration-200 ease-in-out hover:underline hover:underline-offset-2"
            onClick={handleProjectsClick}
          >
            Projects
          </button>
        </nav>
      </header>
    </>
  );
}

export default Header;
