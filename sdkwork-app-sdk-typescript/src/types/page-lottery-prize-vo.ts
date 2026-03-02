import type { LotteryPrizeVO } from './lottery-prize-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageLotteryPrizeVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: LotteryPrizeVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
