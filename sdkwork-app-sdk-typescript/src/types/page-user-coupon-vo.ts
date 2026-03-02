import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';
import type { UserCouponVO } from './user-coupon-vo';

export interface PageUserCouponVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: UserCouponVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
