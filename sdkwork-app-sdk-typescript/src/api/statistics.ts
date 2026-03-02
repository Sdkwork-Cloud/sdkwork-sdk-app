import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultOrganizationStatisticsVO } from '../types';


export class StatisticsApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 获取组织统计 */
  async getOrganization(): Promise<PlusApiResultOrganizationStatisticsVO> {
    return this.client.get<PlusApiResultOrganizationStatisticsVO>(appApiPath(`/organization/statistics`));
  }
}

export function createStatisticsApi(client: HttpClient): StatisticsApi {
  return new StatisticsApi(client);
}
