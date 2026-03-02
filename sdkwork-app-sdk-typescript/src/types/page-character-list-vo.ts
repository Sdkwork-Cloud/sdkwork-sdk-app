import type { CharacterListVO } from './character-list-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageCharacterListVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: CharacterListVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
