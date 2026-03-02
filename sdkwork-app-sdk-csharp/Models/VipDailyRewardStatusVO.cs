using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipDailyRewardStatusVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? CanClaim { get; set; }
        public bool? ClaimedToday { get; set; }
        public int? ConsecutiveDays { get; set; }
        public int? TotalDays { get; set; }
    }
}
