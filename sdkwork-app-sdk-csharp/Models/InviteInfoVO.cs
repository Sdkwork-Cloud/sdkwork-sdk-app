using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class InviteInfoVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? InviteCode { get; set; }
        public string? InviteLink { get; set; }
        public int? InviteCount { get; set; }
        public string? RewardAmount { get; set; }
        public string? RemainingReward { get; set; }
    }
}
