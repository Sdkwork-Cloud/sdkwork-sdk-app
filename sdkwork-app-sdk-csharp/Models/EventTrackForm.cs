using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class EventTrackForm
    {
        public string? EventName { get; set; }
        public string? EventType { get; set; }
        public string? Timestamp { get; set; }
        public string? DeviceId { get; set; }
        public string? UserId { get; set; }
        public Dictionary<string, object>? Properties { get; set; }
        public string? SessionId { get; set; }
        public string? PageUrl { get; set; }
        public string? Referrer { get; set; }
    }
}
