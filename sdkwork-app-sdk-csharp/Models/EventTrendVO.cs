using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class EventTrendVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? EventName { get; set; }
        public List<string>? TimePoints { get; set; }
        public List<int>? Values { get; set; }
        public int? TotalCount { get; set; }
        public double? GrowthRate { get; set; }
        public string? Interval { get; set; }
    }
}
