import type { FileVO } from './file-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageFileVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: FileVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
