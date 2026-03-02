import type { AnnouncementVO } from './announcement-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageAnnouncementVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: AnnouncementVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
