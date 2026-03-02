/** 用户优惠券响应 */
export interface UserCouponVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 用户优惠券ID */
  userCouponId?: string;
  /** 优惠券ID */
  couponId?: string;
  /** 优惠券名称 */
  couponName?: string;
  /** 优惠券编码 */
  couponCode?: string;
  /** 优惠券类型 */
  type?: string;
  /** 类型名称 */
  typeName?: string;
  /** 优惠金额(分) */
  amount?: number;
  /** 折扣率 */
  discount?: number;
  /** 最低消费金额(分) */
  minConsume?: number;
  /** 领取时间 */
  acquireAt?: string;
  /** 使用时间 */
  useAt?: string;
  /** 过期时间 */
  expireAt?: string;
  /** 状态: UNUSED-未使用, USED-已使用, EXPIRED-已过期 */
  status?: string;
  /** 状态名称 */
  statusName?: string;
  /** 关联订单ID */
  orderId?: string;
  /** 是否可分享 */
  canShared?: boolean;
  /** 是否可用 */
  available?: boolean;
  /** 剩余有效天数 */
  remainingDays?: number;
}
