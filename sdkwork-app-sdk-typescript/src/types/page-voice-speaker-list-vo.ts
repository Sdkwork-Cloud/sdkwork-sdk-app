import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';
import type { VoiceSpeakerListVO } from './voice-speaker-list-vo';

export interface PageVoiceSpeakerListVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: VoiceSpeakerListVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
