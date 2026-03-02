import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PasswordChangeForm, PasswordResetForm, PlusApiResultVoid } from '../types';


export class PasswordApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 修改密码 */
  async change(body: PasswordChangeForm): Promise<PlusApiResultVoid> {
    return this.client.put<PlusApiResultVoid>(appApiPath(`/user/password`), body);
  }

/** 重置密码 */
  async reset(body: PasswordResetForm): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(appApiPath(`/auth/password/reset`), body);
  }
}

export function createPasswordApi(client: HttpClient): PasswordApi {
  return new PasswordApi(client);
}
