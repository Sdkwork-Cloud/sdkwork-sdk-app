/** 订单商品项 */
export interface OrderItemForm {
  /** 商品ID */
  productId?: string;
  /** 数量 */
  quantity?: number;
  /** 单价 */
  price?: string;
  /** 商品名称 */
  productName?: string;
}
