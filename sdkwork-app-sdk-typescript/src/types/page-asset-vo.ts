import type { AssetVO } from './asset-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageAssetVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: AssetVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
