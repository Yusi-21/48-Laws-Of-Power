import { useState } from 'react';
import { ChevronDown, ChevronUp, Scale } from 'lucide-react';
import { Law } from '../data/lawsData';

interface LawCardProps {
  law: Law;
  darkMode: boolean;
}

export default function LawCard({ law, darkMode }: LawCardProps) {
  const [isExpanded, setIsExpanded] = useState(false);

  return (
    <div
      className={`rounded-lg overflow-hidden transition-all duration-300 ${
        darkMode ? 'bg-slate-800' : 'bg-white'
      } shadow-lg`}
    >
      <button
        onClick={() => setIsExpanded(!isExpanded)}
        className={`w-full px-5 py-4 flex items-center justify-between transition-colors ${
          darkMode
            ? 'bg-teal-700 hover:bg-teal-600 text-white'
            : 'bg-teal-600 hover:bg-teal-500 text-black'
        }`}
      >
        <span className="flex text-lg font-semibold">
          <Scale className={`mr-3 w-8 h-8 ${darkMode ? 'text-yellow-400' : 'text-yellow-600'}`} />
          <p className="mt-0.5">{law.title}</p>
        </span>
        {isExpanded ? (
          <ChevronUp className="w-6 h-6 flex-shrink-0" />
        ) : (
          <ChevronDown className="w-6 h-6 flex-shrink-0" />
        )}
      </button>

      <div
        className={`transition-all duration-300 ease-in-out ${
          isExpanded ? 'max-h-[2000px] opacity-100' : 'max-h-0 opacity-0'
        } overflow-hidden`}
      >
        <div className="p-5 space-y-4">
          <h3
            className={`text-base font-medium leading-relaxed text-center ${
              darkMode ? 'text-slate-200' : 'text-slate-800'
            }`}
          >
            {law.subtitle}
          </h3>

          {law.imageUrl && (
            <div className="rounded-lg overflow-hidden bg-white">
              <img
                src={law.imageUrl}
                alt={law.title}
                className="w-full h-auto"
              />
            </div>
          )}

          <p
            className={`text-sm leading-relaxed ${
              darkMode ? 'text-slate-400' : 'text-slate-600'
            }`}
          >
            {law.description}
          </p>
        </div>
      </div>
    </div>
  );
}
