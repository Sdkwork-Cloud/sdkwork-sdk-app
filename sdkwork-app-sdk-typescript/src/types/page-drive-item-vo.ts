import type { DriveItemVO } from './drive-item-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageDriveItemVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: DriveItemVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
