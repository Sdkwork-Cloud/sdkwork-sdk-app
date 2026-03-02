import type { FollowUserVO } from './follow-user-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageFollowUserVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: FollowUserVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
