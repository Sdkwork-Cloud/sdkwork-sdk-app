import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultListDepartmentDetailVO, PlusApiResultListDepartmentVO } from '../types';


export class DepartmentsApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 获取组织的部门列表 */
  async getDepartmentsByOrg(orgId: string | number): Promise<PlusApiResultListDepartmentVO> {
    return this.client.get<PlusApiResultListDepartmentVO>(appApiPath(`/organization/${orgId}/departments`));
  }

/** 获取部门树 */
  async getDepartmentTree(orgId: string | number): Promise<PlusApiResultListDepartmentDetailVO> {
    return this.client.get<PlusApiResultListDepartmentDetailVO>(appApiPath(`/organization/${orgId}/departments/tree`));
  }
}

export function createDepartmentsApi(client: HttpClient): DepartmentsApi {
  return new DepartmentsApi(client);
}
