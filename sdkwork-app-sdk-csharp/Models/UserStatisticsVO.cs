using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? UserId { get; set; }
        public string? Username { get; set; }
        public string? Avatar { get; set; }
        public string? RegisteredAt { get; set; }
        public string? LastLoginAt { get; set; }
        public int? LoginCount { get; set; }
        public int? TotalUsageTime { get; set; }
        public int? TotalGenerations { get; set; }
        public int? TotalProjects { get; set; }
        public int? TotalFiles { get; set; }
        public int? TotalStorage { get; set; }
        public UserLevelVO? Level { get; set; }
        public VipStatisticsVO? VipInfo { get; set; }
        public AchievementStatisticsVO? AchievementStats { get; set; }
        public UsageStatisticsVO? UsageStats { get; set; }
        public GenerationStatisticsVO? GenerationStats { get; set; }
    }
}
