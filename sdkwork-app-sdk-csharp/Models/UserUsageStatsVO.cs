using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserUsageStatsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? StatsId { get; set; }
        public string? UserId { get; set; }
        public int? TotalSessions { get; set; }
        public int? TotalDuration { get; set; }
        public int? ActiveDays { get; set; }
        public int? LastActiveDays { get; set; }
        public string? DeviceType { get; set; }
        public string? OsType { get; set; }
        public string? FirstSeen { get; set; }
        public string? LastSeen { get; set; }
        public string? UserType { get; set; }
    }
}
