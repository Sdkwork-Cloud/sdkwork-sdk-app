using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FunnelAnalysisVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? FunnelName { get; set; }
        public List<FunnelStepVO>? Steps { get; set; }
        public double? OverallConversionRate { get; set; }
        public int? TotalUsers { get; set; }
        public int? ConvertedUsers { get; set; }
    }
}
