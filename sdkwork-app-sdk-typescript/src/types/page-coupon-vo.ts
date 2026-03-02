import type { CouponVO } from './coupon-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageCouponVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: CouponVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
