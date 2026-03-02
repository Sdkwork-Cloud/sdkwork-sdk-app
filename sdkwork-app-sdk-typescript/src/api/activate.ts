import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultOrganizationVO } from '../types';


export class ActivateApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 激活组织 */
  async organization(orgId: string | number): Promise<PlusApiResultOrganizationVO> {
    return this.client.post<PlusApiResultOrganizationVO>(appApiPath(`/organization/${orgId}/activate`));
  }
}

export function createActivateApi(client: HttpClient): ActivateApi {
  return new ActivateApi(client);
}
