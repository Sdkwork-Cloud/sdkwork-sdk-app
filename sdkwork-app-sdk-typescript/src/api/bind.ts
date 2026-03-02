import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultVoid, ThirdPartyBindForm } from '../types';


export class BindApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 绑定第三方账号 */
  async thirdPartyAccount(platform: string | number, body: ThirdPartyBindForm): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(appApiPath(`/user/bind/${platform}`), body);
  }

/** 解绑第三方账号 */
  async unbindThirdPartyAccount(platform: string | number): Promise<PlusApiResultVoid> {
    return this.client.delete<PlusApiResultVoid>(appApiPath(`/user/bind/${platform}`));
  }
}

export function createBindApi(client: HttpClient): BindApi {
  return new BindApi(client);
}
