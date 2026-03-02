using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class HistoryStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? BrowseCount { get; set; }
        public int? OperationCount { get; set; }
        public int? GenerationCount { get; set; }
        public int? LoginCount { get; set; }
        public int? ActiveSessionCount { get; set; }
        public int? TodayOperationCount { get; set; }
        public int? WeeklyOperationCount { get; set; }
        public int? MonthlyOperationCount { get; set; }
        public string? MostFrequentAction { get; set; }
        public string? MostFrequentBrowseType { get; set; }
    }
}
