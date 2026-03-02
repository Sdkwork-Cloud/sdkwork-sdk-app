import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { DepartmentCreateForm, PlusApiResultDepartmentDetailVO, PlusApiResultDepartmentVO, PlusApiResultListDepartmentVO } from '../types';


export class DepartmentApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 创建部门 */
  async createDepartment(body: DepartmentCreateForm): Promise<PlusApiResultDepartmentVO> {
    return this.client.post<PlusApiResultDepartmentVO>(appApiPath(`/organization/department`), body);
  }

/** 获取部门详情 */
  async getDepartment(deptId: string | number): Promise<PlusApiResultDepartmentDetailVO> {
    return this.client.get<PlusApiResultDepartmentDetailVO>(appApiPath(`/organization/department/${deptId}`));
  }

/** 获取子部门 */
  async getChildDepartments(deptId: string | number): Promise<PlusApiResultListDepartmentVO> {
    return this.client.get<PlusApiResultListDepartmentVO>(appApiPath(`/organization/department/${deptId}/children`));
  }
}

export function createDepartmentApi(client: HttpClient): DepartmentApi {
  return new DepartmentApi(client);
}
