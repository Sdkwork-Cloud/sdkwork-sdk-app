import type { GenerationHistoryVO } from './generation-history-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageGenerationHistoryVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: GenerationHistoryVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
