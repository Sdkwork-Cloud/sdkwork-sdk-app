import type { PageableObject } from './pageable-object';
import type { SkuVO } from './sku-vo';
import type { SortObject } from './sort-object';

export interface PageSkuVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: SkuVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
