using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UsageStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TodayUsage { get; set; }
        public int? WeekUsage { get; set; }
        public int? MonthUsage { get; set; }
        public int? TotalUsage { get; set; }
        public double? AvgDailyUsage { get; set; }
        public int? MaxDailyUsage { get; set; }
        public UsageFrequencyVO? Frequency { get; set; }
        public UsageTimeDistributionVO? TimeDistribution { get; set; }
    }
}
