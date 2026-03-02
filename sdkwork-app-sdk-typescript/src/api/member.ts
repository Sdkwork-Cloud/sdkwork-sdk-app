import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultMemberVO } from '../types';


export class MemberApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 获取成员详情 */
  async getMember(memberId: string | number): Promise<PlusApiResultMemberVO> {
    return this.client.get<PlusApiResultMemberVO>(appApiPath(`/organization/member/${memberId}`));
  }
}

export function createMemberApi(client: HttpClient): MemberApi {
  return new MemberApi(client);
}
