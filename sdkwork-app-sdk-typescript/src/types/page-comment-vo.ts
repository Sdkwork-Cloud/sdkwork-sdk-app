import type { CommentVO } from './comment-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageCommentVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: CommentVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
