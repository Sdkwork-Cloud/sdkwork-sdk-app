import type { InvoiceVO } from './invoice-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageInvoiceVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: InvoiceVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
