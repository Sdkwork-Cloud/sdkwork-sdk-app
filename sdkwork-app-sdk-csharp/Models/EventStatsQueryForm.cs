using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class EventStatsQueryForm
    {
        public string? EventName { get; set; }
        public string? StartDate { get; set; }
        public string? EndDate { get; set; }
        public string? Interval { get; set; }
        public string? DeviceType { get; set; }
        public string? OsType { get; set; }
    }
}
