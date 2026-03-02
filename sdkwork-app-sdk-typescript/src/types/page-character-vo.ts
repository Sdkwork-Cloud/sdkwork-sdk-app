import type { CharacterVO } from './character-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageCharacterVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: CharacterVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
