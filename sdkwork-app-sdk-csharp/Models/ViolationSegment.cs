using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ViolationSegment
    {
        public int? StartTime { get; set; }
        public int? EndTime { get; set; }
        public string? ViolationType { get; set; }
        public string? Text { get; set; }
        public double? Confidence { get; set; }
    }
}
