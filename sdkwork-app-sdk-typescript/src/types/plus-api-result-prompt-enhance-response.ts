import type { PromptEnhanceResponse } from './prompt-enhance-response';

export interface PlusApiResultPromptEnhanceResponse {
  code: number;
  msg: string;
  data?: PromptEnhanceResponse;
  timestamp?: string;
  traceId?: string;
}
