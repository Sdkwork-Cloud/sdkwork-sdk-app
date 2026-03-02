export interface PlusApiErrorResult {
  code: number;
  msg: string;
  data?: unknown;
  timestamp?: string;
  traceId?: string;
}
