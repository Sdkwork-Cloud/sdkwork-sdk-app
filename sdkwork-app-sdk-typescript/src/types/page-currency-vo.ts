import type { CurrencyVO } from './currency-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageCurrencyVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: CurrencyVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
