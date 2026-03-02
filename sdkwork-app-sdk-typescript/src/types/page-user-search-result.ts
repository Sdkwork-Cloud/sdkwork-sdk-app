import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';
import type { UserSearchResult } from './user-search-result';

export interface PageUserSearchResult {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: UserSearchResult[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
