using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipCouponVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Name { get; set; }
        public double? Discount { get; set; }
        public double? MinAmount { get; set; }
        public double? ReduceAmount { get; set; }
        public string? ValidFrom { get; set; }
        public string? ValidTo { get; set; }
        public string? Status { get; set; }
        public bool? Used { get; set; }
    }
}
