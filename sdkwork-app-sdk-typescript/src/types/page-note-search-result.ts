import type { NoteSearchResult } from './note-search-result';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageNoteSearchResult {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: NoteSearchResult[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
