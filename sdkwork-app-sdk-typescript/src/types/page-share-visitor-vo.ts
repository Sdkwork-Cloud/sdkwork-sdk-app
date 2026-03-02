import type { PageableObject } from './pageable-object';
import type { ShareVisitorVO } from './share-visitor-vo';
import type { SortObject } from './sort-object';

export interface PageShareVisitorVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ShareVisitorVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
