import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultPageOrganizationVO } from '../types';


export class ListApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 获取组织列表 */
  async getOrganization(params?: QueryParams): Promise<PlusApiResultPageOrganizationVO> {
    return this.client.get<PlusApiResultPageOrganizationVO>(appApiPath(`/organization/list`), params);
  }
}

export function createListApi(client: HttpClient): ListApi {
  return new ListApi(client);
}
