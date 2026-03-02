import type { AssetSearchResult } from './asset-search-result';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageAssetSearchResult {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: AssetSearchResult[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
