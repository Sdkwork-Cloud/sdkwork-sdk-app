import type { AuditRecordVO } from './audit-record-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageAuditRecordVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: AuditRecordVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
