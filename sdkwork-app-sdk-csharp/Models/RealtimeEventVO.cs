using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RealtimeEventVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? EventId { get; set; }
        public string? EventName { get; set; }
        public string? EventType { get; set; }
        public string? UserId { get; set; }
        public string? DeviceId { get; set; }
        public string? Timestamp { get; set; }
        public string? PageUrl { get; set; }
        public string? Referrer { get; set; }
    }
}
