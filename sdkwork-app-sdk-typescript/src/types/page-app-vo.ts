import type { AppVO } from './app-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageAppVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: AppVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
