using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FrameDetection
    {
        public int? Timestamp { get; set; }
        public string? Result { get; set; }
        public string? RiskLevel { get; set; }
    }
}
