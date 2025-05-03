import { Link } from "react-router";

/**
 * Footer component displaying year and links to legal pages.
 */
function Footer() {
  return (
    <footer className="bg-gray-900 py-4 text-white">
      <div className="container mx-auto text-center">
        <p className="text-sm">{new Date().getFullYear()}</p>
        <div className="mt-2">
          <Link
            to={"/privacy-policy"}
            className="mx-2 text-gray-400 hover:text-white"
            // Scroll to top when link is clicked
            onClick={() => window.scrollTo(0, 0)}
          >
            Privacy Policy
          </Link>
          <Link
            to={"/legal-notice"}
            className="mx-2 text-gray-400 hover:text-white"
            // Scroll to top when link is clicked
            onClick={() => window.scrollTo(0, 0)}
          >
            Legal Notice
          </Link>
        </div>
      </div>
    </footer>
  );
}

export default Footer;
