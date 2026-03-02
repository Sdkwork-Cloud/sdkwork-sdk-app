using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RolloutConfigVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RolloutKey { get; set; }
        public string? RolloutName { get; set; }
        public Dictionary<string, object>? Config { get; set; }
        public string? Status { get; set; }
    }
}
