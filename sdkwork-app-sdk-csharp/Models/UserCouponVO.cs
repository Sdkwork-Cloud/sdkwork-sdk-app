using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserCouponVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? UserCouponId { get; set; }
        public string? CouponId { get; set; }
        public string? CouponName { get; set; }
        public string? CouponCode { get; set; }
        public string? Type { get; set; }
        public string? TypeName { get; set; }
        public int? Amount { get; set; }
        public double? Discount { get; set; }
        public int? MinConsume { get; set; }
        public string? AcquireAt { get; set; }
        public string? AcquireRequestNo { get; set; }
        public string? AcquireType { get; set; }
        public int? PointCost { get; set; }
        public bool? PointsRefunded { get; set; }
        public string? PointsRefundAt { get; set; }
        public string? UseAt { get; set; }
        public string? ExpireAt { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public string? OrderId { get; set; }
        public bool? CanShared { get; set; }
        public bool? Available { get; set; }
        public int? RemainingDays { get; set; }
    }
}
