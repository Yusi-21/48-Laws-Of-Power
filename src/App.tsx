import React, { useState } from 'react';
import Header from './components/Header';
import { lawsData } from './data/lawsData';
import LawCard from './components/LawCard';

const App: React.FC = () => {
  const [darkMode, setDarkMode] = useState(true);

  return (
    <div className={`min-h-screen transition-colors duration-300 ${darkMode ? 'bg-slate-900' : 'bg-slate-100'}`}>
      <Header darkMode={darkMode} setDarkMode={setDarkMode} />

      <main className="max-w-2xl mx-auto px-4 py-6 space-y-4">
        {lawsData.map((law) => (
          <LawCard key={law.id} law={law} darkMode={darkMode} />
        ))}
      </main>
    </div>
  );
}

export default App;
