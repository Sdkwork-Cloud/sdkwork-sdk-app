import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultUserProfileVO, UserProfileUpdateForm } from '../types';


export class ProfileApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 获取用户信息 */
  async getUser(): Promise<PlusApiResultUserProfileVO> {
    return this.client.get<PlusApiResultUserProfileVO>(appApiPath(`/user/profile`));
  }

/** 更新用户信息 */
  async updateUser(body: UserProfileUpdateForm): Promise<PlusApiResultUserProfileVO> {
    return this.client.put<PlusApiResultUserProfileVO>(appApiPath(`/user/profile`), body);
  }
}

export function createProfileApi(client: HttpClient): ProfileApi {
  return new ProfileApi(client);
}
