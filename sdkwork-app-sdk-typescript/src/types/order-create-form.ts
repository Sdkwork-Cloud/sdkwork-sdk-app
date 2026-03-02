import type { OrderItemForm } from './order-item-form';

/** 创建订单请求 */
export interface OrderCreateForm {
  /** 订单类型 */
  orderType: string;
  /** 商品ID */
  productId: string;
  /** 数量 */
  quantity: number;
  /** 商品列表 */
  items?: OrderItemForm[];
  /** 收货地址ID */
  addressId?: string;
  /** 支付方式 */
  paymentMethod?: string;
  /** 优惠券ID */
  couponId?: string;
  /** 备注 */
  remark?: string;
  /** 来源渠道 */
  sourceChannel?: string;
  /** 充值积分 */
  rechargePoints?: number;
}
