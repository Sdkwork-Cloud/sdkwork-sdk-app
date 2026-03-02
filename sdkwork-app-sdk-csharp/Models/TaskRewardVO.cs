using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TaskRewardVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RewardId { get; set; }
        public string? TaskId { get; set; }
        public string? RewardType { get; set; }
        public int? RewardAmount { get; set; }
        public string? Status { get; set; }
        public string? Message { get; set; }
        public string? ClaimedAt { get; set; }
    }
}
