/** 模型信息响应 */
export interface ModelInfoVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 模型ID */
  modelId?: string;
  /** 模型标识 */
  model?: string;
  /** 模型名称 */
  name?: string;
  /** 模型描述 */
  description?: string;
  /** 渠道 */
  channel?: string;
  /** 模型类型 */
  modelType?: string;
  /** 模型系列 */
  family?: string;
  /** 版本 */
  version?: string;
  /** 是否开源 */
  openSource?: boolean;
  /** 状态 */
  status?: string;
  /** 使用次数 */
  usageCount?: number;
}
