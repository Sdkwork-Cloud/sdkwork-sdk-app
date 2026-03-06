/** 重置密码挑战请求 */
export interface PasswordResetRequestForm {
  /** 邮箱或手机号 */
  account: string;
  /** 挑战发送渠道 */
  channel: 'EMAIL' | 'SMS';
  /** 设备ID */
  deviceId?: string;
  /** 区域语言 */
  locale?: string;
  /** 跳转地址 */
  redirectUri?: string;
}
