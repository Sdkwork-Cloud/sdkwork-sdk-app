using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OrderItemVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? OrderId { get; set; }
        public string? CategoryId { get; set; }
        public string? ProductType { get; set; }
        public string? ProductId { get; set; }
        public string? SkuId { get; set; }
        public string? ProductName { get; set; }
        public string? ProductImage { get; set; }
        public int? Quantity { get; set; }
        public string? UnitPrice { get; set; }
        public string? TotalAmount { get; set; }
        public string? DiscountAmount { get; set; }
        public string? PaidAmount { get; set; }
        public string? RefundedAmount { get; set; }
        public string? SkuSpec { get; set; }
        public string? Currency { get; set; }
        public string? RefundStatus { get; set; }
        public string? ReviewStatus { get; set; }
        public string? PaymentProvider { get; set; }
        public string? PaymentProductType { get; set; }
        public string? ExpireTime { get; set; }
    }
}
