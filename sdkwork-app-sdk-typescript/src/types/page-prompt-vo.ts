import type { PageableObject } from './pageable-object';
import type { PromptVO } from './prompt-vo';
import type { SortObject } from './sort-object';

export interface PagePromptVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PromptVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
