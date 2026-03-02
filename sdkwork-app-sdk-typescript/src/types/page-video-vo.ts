import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';
import type { VideoVO } from './video-vo';

export interface PageVideoVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: VideoVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
