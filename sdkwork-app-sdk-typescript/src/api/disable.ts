import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultOrganizationVO } from '../types';


export class DisableApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 禁用组织 */
  async organization(orgId: string | number): Promise<PlusApiResultOrganizationVO> {
    return this.client.post<PlusApiResultOrganizationVO>(appApiPath(`/organization/${orgId}/disable`));
  }
}

export function createDisableApi(client: HttpClient): DisableApi {
  return new DisableApi(client);
}
