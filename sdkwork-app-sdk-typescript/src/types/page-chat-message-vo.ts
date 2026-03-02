import type { ChatMessageVO } from './chat-message-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageChatMessageVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ChatMessageVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
