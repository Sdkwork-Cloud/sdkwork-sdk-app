import type { PageableObject } from './pageable-object';
import type { ProductVO } from './product-vo';
import type { SortObject } from './sort-object';

export interface PageProductVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ProductVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
