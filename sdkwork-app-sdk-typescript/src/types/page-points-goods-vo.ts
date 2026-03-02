import type { PageableObject } from './pageable-object';
import type { PointsGoodsVO } from './points-goods-vo';
import type { SortObject } from './sort-object';

export interface PagePointsGoodsVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PointsGoodsVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
