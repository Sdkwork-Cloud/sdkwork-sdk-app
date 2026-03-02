import type { PageableObject } from './pageable-object';
import type { PaymentStatusVO } from './payment-status-vo';
import type { SortObject } from './sort-object';

export interface PagePaymentStatusVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PaymentStatusVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
