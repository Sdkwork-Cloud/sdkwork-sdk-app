using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DailyUsageVO
    {
        public int? GenerationCount { get; set; }
        public int? UsageTime { get; set; }
        public int? StorageUsage { get; set; }
    }
}
