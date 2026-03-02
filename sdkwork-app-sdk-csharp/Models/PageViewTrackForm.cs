using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PageViewTrackForm
    {
        public string? PageUrl { get; set; }
        public string? PageTitle { get; set; }
        public string? Referrer { get; set; }
        public string? Timestamp { get; set; }
        public string? DeviceId { get; set; }
        public string? UserId { get; set; }
        public Dictionary<string, object>? Properties { get; set; }
        public string? SessionId { get; set; }
        public int? Duration { get; set; }
    }
}
