import type { NewsVO } from './news-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageNewsVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: NewsVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
