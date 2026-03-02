using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SessionStatsVO
    {
        public int? TotalMessages { get; set; }
        public int? UserMessages { get; set; }
        public int? AiMessages { get; set; }
        public int? TotalTokens { get; set; }
        public int? AvgResponseTime { get; set; }
        public int? TotalDuration { get; set; }
    }
}
