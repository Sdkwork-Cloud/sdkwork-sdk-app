using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CheckInVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? Success { get; set; }
        public string? CheckInDate { get; set; }
        public int? ConsecutiveDays { get; set; }
        public int? Points { get; set; }
        public Dictionary<string, object>? ExtraRewards { get; set; }
        public bool? CheckedInToday { get; set; }
        public string? Message { get; set; }
    }
}
