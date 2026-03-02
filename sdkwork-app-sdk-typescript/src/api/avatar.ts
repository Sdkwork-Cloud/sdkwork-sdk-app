import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultMapStringString, UploadAvatarRequest } from '../types';


export class AvatarApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 上传头像 */
  async upload(body?: UploadAvatarRequest): Promise<PlusApiResultMapStringString> {
    return this.client.post<PlusApiResultMapStringString>(appApiPath(`/user/avatar`), body);
  }
}

export function createAvatarApi(client: HttpClient): AvatarApi {
  return new AvatarApi(client);
}
