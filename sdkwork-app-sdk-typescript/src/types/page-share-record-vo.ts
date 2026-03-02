import type { PageableObject } from './pageable-object';
import type { ShareRecordVO } from './share-record-vo';
import type { SortObject } from './sort-object';

export interface PageShareRecordVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ShareRecordVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
