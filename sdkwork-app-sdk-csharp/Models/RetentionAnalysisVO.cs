using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RetentionAnalysisVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RetentionType { get; set; }
        public Dictionary<string, double>? RetentionRates { get; set; }
        public double? AverageRetentionRate { get; set; }
        public int? TotalUsers { get; set; }
        public Dictionary<string, int>? CohortSizes { get; set; }
    }
}
