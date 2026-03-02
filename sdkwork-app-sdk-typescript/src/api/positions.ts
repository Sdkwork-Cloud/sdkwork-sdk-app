import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultListPositionDetailVO, PlusApiResultListPositionVO } from '../types';


export class PositionsApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 获取组织的岗位列表 */
  async getPositionsByOrg(orgId: string | number): Promise<PlusApiResultListPositionVO> {
    return this.client.get<PlusApiResultListPositionVO>(appApiPath(`/organization/${orgId}/positions`));
  }

/** 获取岗位树 */
  async getPositionTree(orgId: string | number): Promise<PlusApiResultListPositionDetailVO> {
    return this.client.get<PlusApiResultListPositionDetailVO>(appApiPath(`/organization/${orgId}/positions/tree`));
  }
}

export function createPositionsApi(client: HttpClient): PositionsApi {
  return new PositionsApi(client);
}
