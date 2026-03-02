using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ExperimentConversionForm
    {
        public string? ExperimentKey { get; set; }
        public string? ConversionGoal { get; set; }
        public double? ConversionValue { get; set; }
    }
}
