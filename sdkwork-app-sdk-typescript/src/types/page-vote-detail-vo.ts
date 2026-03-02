import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';
import type { VoteDetailVO } from './vote-detail-vo';

export interface PageVoteDetailVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: VoteDetailVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
