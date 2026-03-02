import type { PageableObject } from './pageable-object';
import type { ProjectVO } from './project-vo';
import type { SortObject } from './sort-object';

export interface PageProjectVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ProjectVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
