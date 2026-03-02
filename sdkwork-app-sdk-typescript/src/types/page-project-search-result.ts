import type { PageableObject } from './pageable-object';
import type { ProjectSearchResult } from './project-search-result';
import type { SortObject } from './sort-object';

export interface PageProjectSearchResult {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ProjectSearchResult[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
