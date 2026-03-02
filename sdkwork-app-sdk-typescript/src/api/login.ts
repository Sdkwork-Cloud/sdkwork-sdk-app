import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { LoginForm, PlusApiResultLoginVO } from '../types';


export class LoginApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 用户登录 */
  async login(body: LoginForm): Promise<PlusApiResultLoginVO> {
    return this.client.post<PlusApiResultLoginVO>(appApiPath(`/auth/login`), body);
  }
}

export function createLoginApi(client: HttpClient): LoginApi {
  return new LoginApi(client);
}
