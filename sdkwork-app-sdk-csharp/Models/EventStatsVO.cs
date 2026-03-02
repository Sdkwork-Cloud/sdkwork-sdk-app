using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class EventStatsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? EventName { get; set; }
        public int? TotalCount { get; set; }
        public double? AveragePerUser { get; set; }
        public Dictionary<string, int>? HourlyStats { get; set; }
        public Dictionary<string, int>? DailyStats { get; set; }
        public Dictionary<string, object>? TopProperties { get; set; }
    }
}
