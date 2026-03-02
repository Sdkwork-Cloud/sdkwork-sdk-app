import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PhoneLoginForm, PlusApiResultLoginVO } from '../types';


export class PhoneApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 手机号验证码登录 */
  async login(body: PhoneLoginForm): Promise<PlusApiResultLoginVO> {
    return this.client.post<PlusApiResultLoginVO>(appApiPath(`/auth/phone/login`), body);
  }
}

export function createPhoneApi(client: HttpClient): PhoneApi {
  return new PhoneApi(client);
}
