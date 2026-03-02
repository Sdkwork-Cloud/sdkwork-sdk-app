import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { AccountDeactivateForm, PlusApiResultVoid } from '../types';


export class DeactivateApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 注销账号 */
  async account(body: AccountDeactivateForm): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(appApiPath(`/user/deactivate`), body);
  }
}

export function createDeactivateApi(client: HttpClient): DeactivateApi {
  return new DeactivateApi(client);
}
