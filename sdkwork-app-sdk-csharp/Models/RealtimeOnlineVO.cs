using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RealtimeOnlineVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? CurrentOnline { get; set; }
        public int? PeakOnline { get; set; }
        public int? AverageOnline { get; set; }
        public int? NewUsers { get; set; }
        public int? ActiveUsers { get; set; }
        public string? Timestamp { get; set; }
    }
}
