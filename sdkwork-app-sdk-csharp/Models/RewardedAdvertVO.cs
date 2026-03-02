using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RewardedAdvertVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? AdvertId { get; set; }
        public string? AdvertName { get; set; }
        public string? AdvertType { get; set; }
        public string? PositionId { get; set; }
        public string? CreativeUrl { get; set; }
        public string? LandingUrl { get; set; }
        public int? Priority { get; set; }
        public bool? Enabled { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public int? ClickCount { get; set; }
        public int? ImpressionCount { get; set; }
        public string? RewardType { get; set; }
        public int? RewardAmount { get; set; }
        public int? VideoDuration { get; set; }
        public bool? SkipEnabled { get; set; }
        public string? RewardMessage { get; set; }
    }
}
