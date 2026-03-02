import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';
import type { TutorialVO } from './tutorial-vo';

export interface PageTutorialVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: TutorialVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
