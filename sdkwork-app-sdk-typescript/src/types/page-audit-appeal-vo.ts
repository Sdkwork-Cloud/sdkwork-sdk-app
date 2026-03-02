import type { AuditAppealVO } from './audit-appeal-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageAuditAppealVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: AuditAppealVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
