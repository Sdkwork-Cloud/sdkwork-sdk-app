using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PrizeClaimVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? Success { get; set; }
        public string? PrizeName { get; set; }
        public string? PrizeType { get; set; }
        public string? ClaimTime { get; set; }
        public Dictionary<string, object>? RewardDetails { get; set; }
        public string? Message { get; set; }
    }
}
