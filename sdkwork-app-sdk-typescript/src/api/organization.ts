import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { OrganizationCreateForm, PlusApiResultOrganizationDetailVO, PlusApiResultOrganizationVO } from '../types';


export class OrganizationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 创建组织 */
  async createOrganization(body: OrganizationCreateForm): Promise<PlusApiResultOrganizationVO> {
    return this.client.post<PlusApiResultOrganizationVO>(appApiPath(`/organization`), body);
  }

/** 获取组织详情 */
  async getOrganization(orgId: string | number): Promise<PlusApiResultOrganizationDetailVO> {
    return this.client.get<PlusApiResultOrganizationDetailVO>(appApiPath(`/organization/${orgId}`));
  }
}

export function createOrganizationApi(client: HttpClient): OrganizationApi {
  return new OrganizationApi(client);
}
