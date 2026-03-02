import type { ModelLimitInfo } from './model-limit-info';
import type { ModelMetadata } from './model-metadata';
import type { ModelPrice } from './model-price';
import type { SceneContent } from './scene-content';
import type { TagsContent } from './tags-content';

/** 模型详情响应 */
export interface ModelInfoDetailVO {
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
  /** 供应商 */
  vendor?: string;
  /** 模型类型 */
  modelType?: string;
  /** 模型系列 */
  family?: string;
  /** 版本 */
  version?: string;
  /** 是否开源 */
  openSource?: boolean;
  /** API端点 */
  apiEndpoint?: string;
  /** 所有者 */
  ownedBy?: string;
  /** 使用场景 */
  scenes?: SceneContent;
  /** 标签 */
  tags?: TagsContent;
  /** 限制信息 */
  limitInfo?: ModelLimitInfo;
  /** 价格信息 */
  priceInfo?: ModelPrice;
  /** 元数据 */
  metadata?: ModelMetadata;
  /** 默认温度 */
  defaultTemperature?: number;
  /** 默认TopP */
  defaultTopP?: number;
  /** 默认频率惩罚 */
  defaultFrequencyPenalty?: number;
  /** 默认存在惩罚 */
  defaultPresencePenalty?: number;
  /** 状态 */
  status?: string;
  /** 使用次数 */
  usageCount?: number;
  /** 总Token数 */
  totalTokens?: number;
  /** 平均响应时间 */
  avgResponseTime?: number;
}
