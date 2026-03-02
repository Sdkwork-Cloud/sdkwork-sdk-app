using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VideoCompleteForm
    {
        public string? AdvertId { get; set; }
        public string? VideoId { get; set; }
        public string? CompleteTime { get; set; }
        public string? Duration { get; set; }
        public string? DeviceId { get; set; }
        public string? IpAddress { get; set; }
    }
}
