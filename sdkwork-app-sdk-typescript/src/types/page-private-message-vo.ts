import type { PageableObject } from './pageable-object';
import type { PrivateMessageVO } from './private-message-vo';
import type { SortObject } from './sort-object';

export interface PagePrivateMessageVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PrivateMessageVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
