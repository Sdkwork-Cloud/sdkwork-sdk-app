import type { ActivityVO } from './activity-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageActivityVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ActivityVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
