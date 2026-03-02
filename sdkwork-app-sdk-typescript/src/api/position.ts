import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultListPositionVO, PlusApiResultPositionDetailVO, PlusApiResultPositionVO, PositionCreateForm } from '../types';


export class PositionApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 创建岗位 */
  async createPosition(body: PositionCreateForm): Promise<PlusApiResultPositionVO> {
    return this.client.post<PlusApiResultPositionVO>(appApiPath(`/organization/position`), body);
  }

/** 获取岗位详情 */
  async getPosition(posId: string | number): Promise<PlusApiResultPositionDetailVO> {
    return this.client.get<PlusApiResultPositionDetailVO>(appApiPath(`/organization/position/${posId}`));
  }

/** 获取子岗位 */
  async getChildPositions(posId: string | number): Promise<PlusApiResultListPositionVO> {
    return this.client.get<PlusApiResultListPositionVO>(appApiPath(`/organization/position/${posId}/children`));
  }
}

export function createPositionApi(client: HttpClient): PositionApi {
  return new PositionApi(client);
}
