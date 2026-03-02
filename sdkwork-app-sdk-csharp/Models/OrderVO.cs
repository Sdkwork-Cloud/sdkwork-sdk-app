using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OrderVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? OrderId { get; set; }
        public string? OrderSn { get; set; }
        public string? OrderType { get; set; }
        public string? Subject { get; set; }
        public string? ProductImage { get; set; }
        public int? Quantity { get; set; }
        public string? TotalAmount { get; set; }
        public string? PaidAmount { get; set; }
        public string? PaidPointsAmount { get; set; }
        public string? DiscountAmount { get; set; }
        public string? ShippingAmount { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public string? RefundStatus { get; set; }
        public string? PaymentMethod { get; set; }
        public string? PaymentProvider { get; set; }
        public string? PayTime { get; set; }
        public string? ExpireTime { get; set; }
        public string? Remark { get; set; }
    }
}
