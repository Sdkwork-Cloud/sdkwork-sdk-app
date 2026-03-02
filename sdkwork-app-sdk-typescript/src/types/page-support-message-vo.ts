import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';
import type { SupportMessageVO } from './support-message-vo';

export interface PageSupportMessageVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: SupportMessageVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
