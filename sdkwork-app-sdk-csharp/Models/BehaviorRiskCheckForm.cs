using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BehaviorRiskCheckForm
    {
        public string? UserId { get; set; }
        public string? BehaviorType { get; set; }
        public int? Frequency { get; set; }
        public Dictionary<string, object>? Context { get; set; }
        public int? TimeWindow { get; set; }
    }
}
