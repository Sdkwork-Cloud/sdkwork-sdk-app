import type { InviteRecordVO } from './invite-record-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageInviteRecordVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: InviteRecordVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
