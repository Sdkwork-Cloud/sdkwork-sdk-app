using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class StatisticsVO
    {
        public int? TotalProjects { get; set; }
        public int? TotalGenerations { get; set; }
        public int? TotalUsageTime { get; set; }
        public StorageStatisticsVO? Storage { get; set; }
        public DailyUsageVO? DailyUsage { get; set; }
    }
}
