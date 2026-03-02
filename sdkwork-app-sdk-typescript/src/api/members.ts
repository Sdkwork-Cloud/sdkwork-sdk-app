import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultPageMemberVO } from '../types';


export class MembersApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 获取组织成员 */
  async getMembersByOrg(orgId: string | number, params?: QueryParams): Promise<PlusApiResultPageMemberVO> {
    return this.client.get<PlusApiResultPageMemberVO>(appApiPath(`/organization/${orgId}/members`), params);
  }
}

export function createMembersApi(client: HttpClient): MembersApi {
  return new MembersApi(client);
}
