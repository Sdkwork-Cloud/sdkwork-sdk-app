export interface PromptEnhanceRequest {
  prompt: string;
  scene?: string;
  style?: string;
  language?: string;
  maxWords?: number;
}
