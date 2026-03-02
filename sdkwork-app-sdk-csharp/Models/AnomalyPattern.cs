using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AnomalyPattern
    {
        public string? Type { get; set; }
        public string? Description { get; set; }
        public string? Severity { get; set; }
        public string? DetectedAt { get; set; }
    }
}
