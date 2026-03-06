using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CouponVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? CouponId { get; set; }
        public string? Name { get; set; }
        public string? Type { get; set; }
        public string? TypeName { get; set; }
        public string? Description { get; set; }
        public int? Amount { get; set; }
        public int? PointCost { get; set; }
        public double? Discount { get; set; }
        public int? MinConsume { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public int? Total { get; set; }
        public int? GetLimit { get; set; }
        public int? ReceivedCount { get; set; }
        public int? UsedCount { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public bool? Stackable { get; set; }
        public string? ScopeType { get; set; }
        public string? ScopeValue { get; set; }
        public int? RemainingCount { get; set; }
        public bool? CanReceive { get; set; }
        public bool? PointsExchange { get; set; }
    }
}
