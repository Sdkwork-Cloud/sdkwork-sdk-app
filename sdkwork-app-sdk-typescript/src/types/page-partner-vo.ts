import type { PageableObject } from './pageable-object';
import type { PartnerVO } from './partner-vo';
import type { SortObject } from './sort-object';

export interface PagePartnerVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PartnerVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
