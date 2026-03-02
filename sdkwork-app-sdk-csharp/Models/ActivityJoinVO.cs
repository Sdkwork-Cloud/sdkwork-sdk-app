using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ActivityJoinVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RecordId { get; set; }
        public bool? Success { get; set; }
        public string? Result { get; set; }
        public Dictionary<string, object>? Rewards { get; set; }
        public int? RemainingCount { get; set; }
        public string? Message { get; set; }
    }
}
