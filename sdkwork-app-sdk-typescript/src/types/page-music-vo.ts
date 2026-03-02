import type { MusicVO } from './music-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageMusicVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: MusicVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
