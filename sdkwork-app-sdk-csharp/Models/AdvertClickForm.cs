using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AdvertClickForm
    {
        public string? AdvertId { get; set; }
        public string? PositionId { get; set; }
        public string? ClickTime { get; set; }
        public string? DeviceId { get; set; }
        public string? IpAddress { get; set; }
        public string? UserAgent { get; set; }
    }
}
