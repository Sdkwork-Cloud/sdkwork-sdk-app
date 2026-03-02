import type { PageableObject } from './pageable-object';
import type { SearchResult } from './search-result';
import type { SortObject } from './sort-object';

export interface PageSearchResult {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: SearchResult[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
