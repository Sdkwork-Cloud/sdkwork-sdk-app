using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BrowseStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalCount { get; set; }
        public int? TotalDuration { get; set; }
        public int? AverageDuration { get; set; }
        public int? TodayCount { get; set; }
        public int? WeeklyCount { get; set; }
        public int? MonthlyCount { get; set; }
        public Dictionary<string, int>? TypeDistribution { get; set; }
        public Dictionary<string, int>? SourceDistribution { get; set; }
        public Dictionary<string, int>? DailyTrend { get; set; }
    }
}
