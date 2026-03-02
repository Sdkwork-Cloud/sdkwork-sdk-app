import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultUserInfoVO, RegisterForm } from '../types';


export class RegisterApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 用户注册 */
  async register(body: RegisterForm): Promise<PlusApiResultUserInfoVO> {
    return this.client.post<PlusApiResultUserInfoVO>(appApiPath(`/auth/register`), body);
  }
}

export function createRegisterApi(client: HttpClient): RegisterApi {
  return new RegisterApi(client);
}
