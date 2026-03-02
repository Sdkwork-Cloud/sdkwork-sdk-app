import type { BrowseHistoryVO } from './browse-history-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageBrowseHistoryVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: BrowseHistoryVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
