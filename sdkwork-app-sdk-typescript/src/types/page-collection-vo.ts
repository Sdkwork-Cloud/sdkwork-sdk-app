import type { CollectionVO } from './collection-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageCollectionVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: CollectionVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
