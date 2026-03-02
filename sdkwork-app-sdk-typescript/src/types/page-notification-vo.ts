import type { NotificationVO } from './notification-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageNotificationVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: NotificationVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
