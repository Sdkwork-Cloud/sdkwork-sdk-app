import type { FeedbackVO } from './feedback-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageFeedbackVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: FeedbackVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
