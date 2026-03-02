import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultVerifyResultVO, PlusApiResultVoid, VerifyCodeCheckForm, VerifyCodeSendForm } from '../types';


export class SmsApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 验证验证码 */
  async verifySmsCode(body: VerifyCodeCheckForm): Promise<PlusApiResultVerifyResultVO> {
    return this.client.post<PlusApiResultVerifyResultVO>(appApiPath(`/auth/sms/verify`), body);
  }

/** 发送验证码 */
  async sendSmsCode(body: VerifyCodeSendForm): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(appApiPath(`/auth/sms/send`), body);
  }
}

export function createSmsApi(client: HttpClient): SmsApi {
  return new SmsApi(client);
}
