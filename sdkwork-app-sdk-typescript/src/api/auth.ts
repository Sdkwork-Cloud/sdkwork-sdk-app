import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PasswordResetRequestForm, PlusApiResultVoid } from '../types';


export class AuthApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Request password reset challenge */
  async requestPasswordResetChallenge(body: PasswordResetRequestForm): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(appApiPath(`/auth/password/reset/request`), body);
  }
}

export function createAuthApi(client: HttpClient): AuthApi {
  return new AuthApi(client);
}
