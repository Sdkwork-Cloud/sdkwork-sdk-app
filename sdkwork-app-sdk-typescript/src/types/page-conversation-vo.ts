import type { ConversationVO } from './conversation-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageConversationVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ConversationVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
