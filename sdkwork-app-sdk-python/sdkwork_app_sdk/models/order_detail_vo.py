from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderDetailVO:
    """订单详情响应"""
    created_at: str = None
    updated_at: str = None
    order_id: str = None
    order_sn: str = None
    order_type: str = None
    order_type_name: str = None
    subject: str = None
    product_id: str = None
    product_image: str = None
    quantity: int = None
    product_amount: str = None
    shipping_amount: str = None
    discount_amount: str = None
    tax_amount: str = None
    total_amount: str = None
    paid_amount: str = None
    paid_points_amount: str = None
    refunded_amount: str = None
    status: str = None
    status_name: str = None
    refund_status: str = None
    refund_status_name: str = None
    payment_method: str = None
    payment_provider: str = None
    transaction_id: str = None
    out_trade_no: str = None
    currency: str = None
    pay_time: str = None
    expire_time: str = None
    complete_time: str = None
    cancel_time: str = None
    remark: str = None
    merchant_remark: str = None
    source_channel: str = None
    user_id: int = None
    username: str = None
    email: str = None
    receiver_name: str = None
    receiver_phone: str = None
    receiver_address: str = None
    logistics_company: str = None
    logistics_no: str = None
    deliver_time: str = None
    coupon_info: CouponInfoVO = None
    items: List[OrderItemVO] = None
    address: OrderAddressVO = None
