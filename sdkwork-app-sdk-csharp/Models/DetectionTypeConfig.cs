using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DetectionTypeConfig
    {
        public string? Type { get; set; }
        public string? Name { get; set; }
        public bool? Enabled { get; set; }
        public string? Sensitivity { get; set; }
        public double? Threshold { get; set; }
    }
}
