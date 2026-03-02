/** 优惠券列表查询请求 */
export interface CouponListForm {
  /** 优惠券类型: DISCOUNT-折扣券, CASH-代金券, GIFT-礼品券 */
  type?: string;
  /** 状态: ACTIVE-有效, INACTIVE-无效 */
  status?: string;
  /** 关键词 */
  keyword?: string;
  /** 页码 */
  pageNum?: number;
  /** 每页大小 */
  pageSize?: number;
}
