using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AdvertCloseForm
    {
        public string? AdvertId { get; set; }
        public string? PositionId { get; set; }
        public string? CloseTime { get; set; }
        public string? Duration { get; set; }
        public string? DeviceId { get; set; }
        public string? IpAddress { get; set; }
    }
}
