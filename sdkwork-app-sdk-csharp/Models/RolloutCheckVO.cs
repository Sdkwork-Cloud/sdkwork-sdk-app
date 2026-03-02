using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RolloutCheckVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RolloutKey { get; set; }
        public bool? CanRollout { get; set; }
        public string? Reason { get; set; }
        public string? Status { get; set; }
        public string? CheckedAt { get; set; }
    }
}
