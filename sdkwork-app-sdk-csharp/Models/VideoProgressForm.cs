using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VideoProgressForm
    {
        public string? AdvertId { get; set; }
        public string? VideoId { get; set; }
        public int? Progress { get; set; }
        public string? Timestamp { get; set; }
        public string? DeviceId { get; set; }
        public string? IpAddress { get; set; }
    }
}
