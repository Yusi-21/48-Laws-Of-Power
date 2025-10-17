import { LawString, lawsStrings } from "./lawsStrings";

export interface Law extends LawString {
  title: string;
  imageUrl: string;
}

export const lawsData: Law[] = Array.from({ length: lawsStrings.length }, (_, index) => ({
  id: lawsStrings[index].id,
  title: `Law ${lawsStrings[index].id}`,
  subtitle: lawsStrings[index].subtitle,
  imageUrl: `/src/images/image_law_${lawsStrings[index].id}.png`,
  description: lawsStrings[index].description
}));
