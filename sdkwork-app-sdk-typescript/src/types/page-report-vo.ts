import type { PageableObject } from './pageable-object';
import type { ReportVO } from './report-vo';
import type { SortObject } from './sort-object';

export interface PageReportVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ReportVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
