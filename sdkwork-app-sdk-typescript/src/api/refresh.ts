import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultLoginVO, TokenRefreshForm } from '../types';


export class RefreshApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 刷新令牌 */
  async token(body: TokenRefreshForm): Promise<PlusApiResultLoginVO> {
    return this.client.post<PlusApiResultLoginVO>(appApiPath(`/auth/refresh`), body);
  }
}

export function createRefreshApi(client: HttpClient): RefreshApi {
  return new RefreshApi(client);
}
