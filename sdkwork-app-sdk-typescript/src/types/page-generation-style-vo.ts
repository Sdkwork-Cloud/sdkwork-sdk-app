import type { GenerationStyleVO } from './generation-style-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageGenerationStyleVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: GenerationStyleVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
