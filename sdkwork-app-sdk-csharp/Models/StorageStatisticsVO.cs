using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class StorageStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalStorage { get; set; }
        public int? UsedStorage { get; set; }
        public int? RemainingStorage { get; set; }
        public double? UsageRate { get; set; }
        public StorageTypeDistributionVO? TypeDistribution { get; set; }
        public StorageTrendVO? Trend { get; set; }
    }
}
