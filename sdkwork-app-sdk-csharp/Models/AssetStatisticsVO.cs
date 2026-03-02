using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AssetStatisticsVO
    {
        public int? TotalAssets { get; set; }
        public int? ImageCount { get; set; }
        public int? VideoCount { get; set; }
        public int? AudioCount { get; set; }
    }
}
