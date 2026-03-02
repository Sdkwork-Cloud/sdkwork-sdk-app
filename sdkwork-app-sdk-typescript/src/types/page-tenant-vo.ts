import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';
import type { TenantVO } from './tenant-vo';

export interface PageTenantVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: TenantVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
