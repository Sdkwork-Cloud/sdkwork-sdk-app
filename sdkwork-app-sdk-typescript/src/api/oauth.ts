import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { OAuthAuthUrlForm, OAuthLoginForm, PlusApiResultLoginVO, PlusApiResultOAuthUrlVO } from '../types';


export class OauthApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** OAuth授权URL */
  async getOauthUrl(body: OAuthAuthUrlForm): Promise<PlusApiResultOAuthUrlVO> {
    return this.client.post<PlusApiResultOAuthUrlVO>(appApiPath(`/auth/oauth/url`), body);
  }

/** OAuth登录 */
  async login(body: OAuthLoginForm): Promise<PlusApiResultLoginVO> {
    return this.client.post<PlusApiResultLoginVO>(appApiPath(`/auth/oauth/login`), body);
  }
}

export function createOauthApi(client: HttpClient): OauthApi {
  return new OauthApi(client);
}
