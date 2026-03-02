using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CheckInRecordVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Date { get; set; }
        public bool? CheckedIn { get; set; }
        public bool? IsMakeUp { get; set; }
        public int? Points { get; set; }
        public int? ConsecutiveDays { get; set; }
        public Dictionary<string, object>? ExtraRewards { get; set; }
    }
}
