/** 注册表单 */
export interface RegisterForm {
  /** 用户名 */
  username: string;
  /** 密码 */
  password: string;
  /** 确认密码 */
  confirmPassword: string;
  /** 邮箱 */
  email?: string;
  /** 手机号 */
  phone?: string;
}
