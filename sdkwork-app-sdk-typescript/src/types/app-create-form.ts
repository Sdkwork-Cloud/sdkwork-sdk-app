/** 创建应用表单 */
export interface AppCreateForm {
  /** 应用名称 */
  name: string;
  /** 应用描述 */
  description?: string;
  /** 应用类型 */
  appType?: string;
  /** 项目ID */
  projectId?: number;
}
