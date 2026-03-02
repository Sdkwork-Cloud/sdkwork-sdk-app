import type { DocumentVO } from './document-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageDocumentVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: DocumentVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
