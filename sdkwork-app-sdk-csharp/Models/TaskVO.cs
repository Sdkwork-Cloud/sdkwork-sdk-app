using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TaskVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TaskId { get; set; }
        public string? TaskName { get; set; }
        public string? TaskType { get; set; }
        public string? Status { get; set; }
        public int? Progress { get; set; }
        public int? Total { get; set; }
        public string? RewardType { get; set; }
        public int? RewardAmount { get; set; }
        public string? ExpireAt { get; set; }
    }
}
