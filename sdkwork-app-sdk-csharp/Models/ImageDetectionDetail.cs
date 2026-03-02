using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ImageDetectionDetail
    {
        public string? Type { get; set; }
        public bool? Hit { get; set; }
        public double? Confidence { get; set; }
        public string? SubType { get; set; }
    }
}
