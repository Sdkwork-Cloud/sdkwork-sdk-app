import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultVoid } from '../types';


export class LogoutApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 用户登出 */
  async logout(): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(appApiPath(`/auth/logout`));
  }
}

export function createLogoutApi(client: HttpClient): LogoutApi {
  return new LogoutApi(client);
}
