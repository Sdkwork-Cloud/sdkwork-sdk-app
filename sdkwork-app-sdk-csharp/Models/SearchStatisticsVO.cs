using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SearchStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalSearches { get; set; }
        public int? TodaySearches { get; set; }
        public int? ThisWeekSearches { get; set; }
        public int? ThisMonthSearches { get; set; }
        public Dictionary<string, int>? HotKeywords { get; set; }
        public Dictionary<string, int>? TypeDistribution { get; set; }
        public string? LastSearchTime { get; set; }
    }
}
