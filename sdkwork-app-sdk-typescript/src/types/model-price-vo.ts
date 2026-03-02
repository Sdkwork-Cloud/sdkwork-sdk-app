/** 模型价格响应 */
export interface ModelPriceVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 模型标识 */
  model?: string;
  /** 计量单位 */
  unit?: string;
  /** 货币 */
  currency?: string;
  /** 基础价格 */
  price?: number;
  /** 输入价格 */
  inputPrice?: number;
  /** 输出价格 */
  outputPrice?: number;
  /** 批量输入价格 */
  batchInputPrice?: number;
  /** 批量输出价格 */
  batchOutputPrice?: number;
  /** 缓存输入价格 */
  cachedInputPrice?: number;
  /** 批量缓存输入价格 */
  batchCachedInputPrice?: number;
}
