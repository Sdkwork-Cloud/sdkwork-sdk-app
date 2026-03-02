import type { FaqVO } from './faq-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageFaqVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: FaqVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
