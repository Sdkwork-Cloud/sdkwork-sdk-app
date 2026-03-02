/** 设备响应 */
export interface DeviceVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 设备ID */
  deviceId?: string;
  /** 设备类型 */
  deviceType?: string;
  /** 设备名称 */
  deviceName?: string;
  /** 推送令牌 */
  pushToken?: string;
  /** 操作系统版本 */
  osVersion?: string;
  /** 应用版本 */
  appVersion?: string;
  /** 是否活跃 */
  isActive?: boolean;
  /** 注册时间 */
  registerTime?: string;
  /** 最后活跃时间 */
  lastActiveAt?: string;
}
