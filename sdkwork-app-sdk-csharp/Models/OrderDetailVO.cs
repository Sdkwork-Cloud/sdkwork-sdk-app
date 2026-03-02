using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OrderDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? OrderId { get; set; }
        public string? OrderSn { get; set; }
        public string? OrderType { get; set; }
        public string? OrderTypeName { get; set; }
        public string? Subject { get; set; }
        public string? ProductId { get; set; }
        public string? ProductImage { get; set; }
        public int? Quantity { get; set; }
        public string? ProductAmount { get; set; }
        public string? ShippingAmount { get; set; }
        public string? DiscountAmount { get; set; }
        public string? TaxAmount { get; set; }
        public string? TotalAmount { get; set; }
        public string? PaidAmount { get; set; }
        public string? PaidPointsAmount { get; set; }
        public string? RefundedAmount { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public string? RefundStatus { get; set; }
        public string? RefundStatusName { get; set; }
        public string? PaymentMethod { get; set; }
        public string? PaymentProvider { get; set; }
        public string? TransactionId { get; set; }
        public string? OutTradeNo { get; set; }
        public string? Currency { get; set; }
        public string? PayTime { get; set; }
        public string? ExpireTime { get; set; }
        public string? CompleteTime { get; set; }
        public string? CancelTime { get; set; }
        public string? Remark { get; set; }
        public string? MerchantRemark { get; set; }
        public string? SourceChannel { get; set; }
        public int? UserId { get; set; }
        public string? Username { get; set; }
        public string? Email { get; set; }
        public string? ReceiverName { get; set; }
        public string? ReceiverPhone { get; set; }
        public string? ReceiverAddress { get; set; }
        public string? LogisticsCompany { get; set; }
        public string? LogisticsNo { get; set; }
        public string? DeliverTime { get; set; }
        public CouponInfoVO? CouponInfo { get; set; }
        public List<OrderItemVO>? Items { get; set; }
        public OrderAddressVO? Address { get; set; }
    }
}
