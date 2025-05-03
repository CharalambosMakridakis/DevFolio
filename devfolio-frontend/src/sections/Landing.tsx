import { gsap } from "gsap";
import { useGSAP } from "@gsap/react";
import TextPlugin from "gsap/TextPlugin";
import { useRef } from "react";
gsap.registerPlugin(useGSAP, TextPlugin);

function Landing() {
  const animatedText = useRef(null);

  useGSAP(() => {
    if (!animatedText.current) return;

    const master = gsap.timeline({ repeat: -1, repeatDelay: 0 });

    // Helper function to create individual text animation timelines
    const createAnimation = (text: string, duration: number, speed: number) => {
      return gsap.timeline({ yoyo: true, repeat: 1 }).to(animatedText.current, {
        duration,
        text: {
          value: text,
          speed,
        },
        ease: "none",
      });
    };

    // Array defining the text animations, their durations, and speeds
    const animations = [
      { text: "CI/CD.", duration: 2, speed: 0.25 },
      { text: "Backend Development.", duration: 3, speed: 0.5 },
      { text: "Frontend Development.", duration: 3, speed: 0.5 },
    ];

    animations.forEach(({ text, duration, speed }) => {
      master.add(createAnimation(text, duration, speed));
    });
  });

  return (
    <div className="flex flex-wrap items-center justify-between gap-4">
      <div className="flex flex-col gap-2 md:w-1/3 text-3xl md:gap-5 md:text-2xl lg:w-1/3 lg:gap-5 lg:text-4xl">
        <p className="font-semibold">
          Hi
          <span className="text-accent">.</span>
        </p>

        <p>
          I'm{" "}
          <span className="text-primary font-light">
            Charalambos Makridakis
          </span>
          , also known as <span className="text-primary font-light">Niko</span>,
          a computer science student from germany, with interests in{" "}
          {/* The span where the text animation will occur */}
          <span
            ref={animatedText}
            className="text-primary inline-block min-w-[350px] font-light"
          />
        </p>
      </div>

      <div className="md:w-1/3 text-3xl md:text-2xl lg:w-1/3 lg:text-4xl">
        <p>
          I'm currently looking for opportunities to{" "}
          <span className="text-primary">apply my skills and contribute</span>{" "}
          to exciting projects.
        </p>
      </div>
    </div>
  );
}

export default Landing;
