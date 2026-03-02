import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageMapStringObject {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: Record<string, unknown>[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
