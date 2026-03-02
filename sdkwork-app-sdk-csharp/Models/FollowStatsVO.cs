using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FollowStatsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? FollowingCount { get; set; }
        public int? FollowersCount { get; set; }
        public int? MutualCount { get; set; }
    }
}
