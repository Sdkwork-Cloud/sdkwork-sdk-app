using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShareStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalShares { get; set; }
        public int? TotalVisits { get; set; }
        public int? TodayShares { get; set; }
        public int? TodayVisits { get; set; }
        public string? SuccessRate { get; set; }
    }
}
