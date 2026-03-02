import type { HistoryVO } from './history-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageHistoryVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: HistoryVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
