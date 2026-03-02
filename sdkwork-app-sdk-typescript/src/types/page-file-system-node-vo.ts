import type { FileSystemNodeVO } from './file-system-node-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageFileSystemNodeVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: FileSystemNodeVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
