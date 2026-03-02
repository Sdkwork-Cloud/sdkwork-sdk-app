using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PathStepVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? PageUrl { get; set; }
        public string? PageTitle { get; set; }
        public int? UserCount { get; set; }
        public double? Percentage { get; set; }
        public List<PathStepVO>? NextSteps { get; set; }
    }
}
