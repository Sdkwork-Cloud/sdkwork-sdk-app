import type { PageableObject } from './pageable-object';
import type { PromptHistoryVO } from './prompt-history-vo';
import type { SortObject } from './sort-object';

export interface PagePromptHistoryVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PromptHistoryVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
