import type { LoginHistoryVO } from './login-history-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageLoginHistoryVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: LoginHistoryVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
