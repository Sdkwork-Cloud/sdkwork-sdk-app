import type { GenerationTaskVO } from './generation-task-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageGenerationTaskVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: GenerationTaskVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
