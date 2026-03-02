import type { BlockedUserVO } from './blocked-user-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageBlockedUserVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: BlockedUserVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
