using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class KeyFrameResult
    {
        public int? Timestamp { get; set; }
        public string? FrameUrl { get; set; }
        public ImageAuditVO? DetectionResult { get; set; }
    }
}
