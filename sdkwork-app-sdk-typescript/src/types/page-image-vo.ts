import type { ImageVO } from './image-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageImageVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ImageVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
