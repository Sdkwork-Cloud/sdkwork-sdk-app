using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PathAnalysisVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? StartPage { get; set; }
        public string? EndPage { get; set; }
        public List<PathStepVO>? Steps { get; set; }
        public int? TotalUsers { get; set; }
        public double? AverageSteps { get; set; }
        public double? ConversionRate { get; set; }
    }
}
