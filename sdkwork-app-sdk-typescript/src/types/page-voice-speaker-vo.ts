import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';
import type { VoiceSpeakerVO } from './voice-speaker-vo';

export interface PageVoiceSpeakerVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: VoiceSpeakerVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
