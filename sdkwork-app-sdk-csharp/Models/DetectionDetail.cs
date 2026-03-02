using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DetectionDetail
    {
        public string? Type { get; set; }
        public bool? Hit { get; set; }
        public double? Confidence { get; set; }
        public List<string>? Keywords { get; set; }
    }
}
