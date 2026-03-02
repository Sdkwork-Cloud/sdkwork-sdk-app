using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FunnelStepVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? EventName { get; set; }
        public int? UserCount { get; set; }
        public double? ConversionRate { get; set; }
        public double? StepConversionRate { get; set; }
    }
}
