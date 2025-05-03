const LegalNotice = () => {
  return (
    <div className="text-text h-screen w-full bg-gray-800 p-10 md:p-20 lg:p-40">
      <div className="p-8 font-sans leading-relaxed">
        <h1 className="text-2xl font-bold mb-4">Impressum</h1>
        <p className="mb-4">
          Charalambos Makridakis
          <br />
          Schmiedegasse 2<br />
          35066 Frankenberg (Eder)
        </p>
        <h2 className="text-xl font-semibold mt-6 mb-2">Kontakt:</h2>
        <p>
          Telefon: +49 151 71014985
          <br />
          Email:{" "}
          <p className="text-blue-200 hover:underline">c.makridakis@gmx.de</p>
          Web: <p className="text-blue-200 hover:underline">makridakis.tech</p>
        </p>
      </div>
    </div>
  );
};

export default LegalNotice;
