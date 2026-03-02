using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ActivityDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public string? CoverImage { get; set; }
        public List<string>? BannerImages { get; set; }
        public string? Rules { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public int? ParticipantCount { get; set; }
        public bool? HasJoined { get; set; }
        public int? MaxJoinCount { get; set; }
        public int? JoinedCount { get; set; }
        public int? RemainingCount { get; set; }
        public List<ActivityReward>? Rewards { get; set; }
        public Dictionary<string, object>? ExtraConfig { get; set; }
    }
}
