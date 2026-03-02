using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AdvertImpressionForm
    {
        public string? AdvertId { get; set; }
        public string? PositionId { get; set; }
        public string? ImpressionTime { get; set; }
        public string? DeviceId { get; set; }
        public string? IpAddress { get; set; }
        public string? UserAgent { get; set; }
        public string? ScreenSize { get; set; }
    }
}
