import type { AppPlatforms } from './app-platforms';
import type { ImageMediaResource } from './image-media-resource';

/** 应用详情响应 */
export interface AppDetailVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 应用ID */
  appId?: string;
  /** 应用名称 */
  name?: string;
  /** 应用描述 */
  description?: string;
  /** 应用图标 */
  icon?: ImageMediaResource;
  /** 图标URL */
  iconUrl?: string;
  /** 访问URL */
  accessUrl?: string;
  /** 版本 */
  version?: string;
  /** 应用类型 */
  appType?: string;
  /** 状态 */
  status?: string;
  /** 项目ID */
  projectId?: number;
  /** 支持平台 */
  platforms?: AppPlatforms;
  /** 包名 */
  packageName?: string;
  /** Bundle ID */
  bundleId?: string;
  /** 商店URL */
  storeUrl?: string;
  /** 下载URL */
  downloadUrl?: string;
}
