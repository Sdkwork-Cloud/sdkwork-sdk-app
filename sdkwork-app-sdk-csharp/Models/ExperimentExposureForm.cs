using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ExperimentExposureForm
    {
        public string? ExperimentKey { get; set; }
        public string? VariantKey { get; set; }
        public object? ExposureContext { get; set; }
    }
}
