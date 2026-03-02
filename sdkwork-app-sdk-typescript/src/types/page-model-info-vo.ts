import type { ModelInfoVO } from './model-info-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageModelInfoVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ModelInfoVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
