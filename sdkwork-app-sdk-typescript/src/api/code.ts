import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultOrganizationDetailVO } from '../types';


export class CodeApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 根据编码获取组织 */
  async getOrganizationBy(code: string | number): Promise<PlusApiResultOrganizationDetailVO> {
    return this.client.get<PlusApiResultOrganizationDetailVO>(appApiPath(`/organization/code/${code}`));
  }
}

export function createCodeApi(client: HttpClient): CodeApi {
  return new CodeApi(client);
}
