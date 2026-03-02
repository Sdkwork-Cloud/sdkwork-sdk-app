using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipPurchaseVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? OrderId { get; set; }
        public int? PackId { get; set; }
        public string? PackName { get; set; }
        public double? Amount { get; set; }
        public int? DurationDays { get; set; }
        public int? TargetLevelId { get; set; }
        public string? TargetLevelName { get; set; }
        public string? Status { get; set; }
    }
}
