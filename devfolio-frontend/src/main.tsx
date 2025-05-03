import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./tailwind.css";
import { BrowserRouter, Route, Routes } from "react-router";
import Layout from "./Layout.tsx";
import PrivacyPolicy from "./pages/PrivacyPolicy.tsx";
import LegalNotice from "./pages/LegalNotice.tsx";
import Homepage from "./pages/Homepage.tsx";

createRoot(document.getElementById("root")!).render(
  <StrictMode>
    <BrowserRouter>
      <Routes>
        <Route element={<Layout />}>
          <Route path="/" element={<Homepage />} />
          <Route path="/privacy-policy" element={<PrivacyPolicy />} />
          <Route path="/legal-notice" element={<LegalNotice />} />
        </Route>
      </Routes>
    </BrowserRouter>
  </StrictMode>,
);
