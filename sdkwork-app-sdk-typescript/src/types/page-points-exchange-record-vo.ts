import type { PageableObject } from './pageable-object';
import type { PointsExchangeRecordVO } from './points-exchange-record-vo';
import type { SortObject } from './sort-object';

export interface PagePointsExchangeRecordVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PointsExchangeRecordVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
