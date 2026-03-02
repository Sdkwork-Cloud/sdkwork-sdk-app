import type { PageableObject } from './pageable-object';
import type { ShopVO } from './shop-vo';
import type { SortObject } from './sort-object';

export interface PageShopVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ShopVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
