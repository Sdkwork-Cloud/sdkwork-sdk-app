using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TimestampedSegment
    {
        public int? StartTime { get; set; }
        public int? EndTime { get; set; }
        public string? Text { get; set; }
        public int? SpeakerId { get; set; }
        public double? Confidence { get; set; }
    }
}
