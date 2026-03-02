using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RewardVerifyVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? Verified { get; set; }
        public string? RewardId { get; set; }
        public string? RewardType { get; set; }
        public int? RewardAmount { get; set; }
        public string? Message { get; set; }
        public string? VerificationToken { get; set; }
    }
}
