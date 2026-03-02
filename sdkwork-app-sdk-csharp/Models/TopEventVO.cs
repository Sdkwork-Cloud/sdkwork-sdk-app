using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TopEventVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? EventName { get; set; }
        public int? Count { get; set; }
        public double? Percentage { get; set; }
        public string? EventType { get; set; }
    }
}
