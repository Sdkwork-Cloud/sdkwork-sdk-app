using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FrequencyStats
    {
        public int? CurrentFrequency { get; set; }
        public int? AvgFrequency { get; set; }
        public int? Limit { get; set; }
        public double? ExcessRatio { get; set; }
    }
}
