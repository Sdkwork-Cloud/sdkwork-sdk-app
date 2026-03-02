import type { OperationHistoryVO } from './operation-history-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageOperationHistoryVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: OperationHistoryVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
