using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipDailyRewardVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? RewardPoints { get; set; }
        public string? ClaimedAt { get; set; }
        public string? Message { get; set; }
        public int? ConsecutiveDays { get; set; }
    }
}
