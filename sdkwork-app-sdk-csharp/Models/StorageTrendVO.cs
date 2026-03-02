using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class StorageTrendVO
    {
        public int? Last7Days { get; set; }
        public int? Last30Days { get; set; }
        public int? Last90Days { get; set; }
        public int? AvgDailyGrowth { get; set; }
    }
}
