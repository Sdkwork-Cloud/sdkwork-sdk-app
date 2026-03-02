using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AchievementStatisticsVO
    {
        public int? TotalAchievements { get; set; }
        public int? UnlockedAchievements { get; set; }
        public double? CompletionRate { get; set; }
        public int? TotalPoints { get; set; }
        public List<AchievementVO>? RecentAchievements { get; set; }
    }
}
