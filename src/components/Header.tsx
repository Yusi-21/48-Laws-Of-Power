import React from 'react';
import { Moon, Sun } from 'lucide-react';
import { lawsStrings } from '../data/lawsStrings';

interface HeaderProps {
  darkMode: boolean;
  setDarkMode: (mode: boolean) => void;
}

const Header: React.FC<HeaderProps> = ({ darkMode, setDarkMode }) => {
  return (
    <header className={`sticky top-0 z-10 ${darkMode ? 'bg-slate-800' : 'bg-white'} shadow-md`}>
      <div className="max-w-2xl mx-auto px-4 py-4 flex items-center justify-between">
        <div className="flex items-center gap-3">
          <div className="bg-slate-800 p-1">
            <img src="/src/images/icon_law.png" width={50} height={50}></img>
          </div>
          <h1 className={`text-4xl font-bold ${darkMode ? 'text-white' : 'text-slate-900'}`}>
            {lawsStrings.length} Laws Of Power
          </h1>
        </div>
        <button
          onClick={() => setDarkMode(!darkMode)}
          className={`p-2 rounded-lg transition-colors ${darkMode ? 'bg-slate-700 hover:bg-slate-600' : 'bg-slate-200 hover:bg-slate-300'}`}
          aria-label="Toggle theme"
        >
          {darkMode ? (
            <Sun className="w-6 h-6 text-yellow-400" />
          ) : (
            <Moon className="w-6 h-6 text-slate-700" />
          )}
        </button>
      </div>
    </header>
  );
}

export default Header;
