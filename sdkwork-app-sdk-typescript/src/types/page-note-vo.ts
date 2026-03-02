import type { NoteVO } from './note-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageNoteVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: NoteVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
