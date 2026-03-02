import type { FavoriteItemVO } from './favorite-item-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageFavoriteItemVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: FavoriteItemVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
