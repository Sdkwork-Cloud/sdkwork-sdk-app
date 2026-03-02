import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultListOrganizationVO } from '../types';


export class ChildrenApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 获取子组织 */
  async getChildOrganizations(orgId: string | number): Promise<PlusApiResultListOrganizationVO> {
    return this.client.get<PlusApiResultListOrganizationVO>(appApiPath(`/organization/${orgId}/children`));
  }
}

export function createChildrenApi(client: HttpClient): ChildrenApi {
  return new ChildrenApi(client);
}
