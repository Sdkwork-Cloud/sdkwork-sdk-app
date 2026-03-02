import type { ActivityRecordVO } from './activity-record-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageActivityRecordVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ActivityRecordVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
