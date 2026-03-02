using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipInviteInfoVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? InviteCode { get; set; }
        public string? InviteLink { get; set; }
        public int? TotalInvites { get; set; }
        public int? SuccessfulInvites { get; set; }
        public int? RewardPoints { get; set; }
        public string? RewardRule { get; set; }
    }
}
