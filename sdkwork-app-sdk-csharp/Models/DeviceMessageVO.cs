using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DeviceMessageVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? MessageId { get; set; }
        public string? DeviceId { get; set; }
        public string? Type { get; set; }
        public string? Direction { get; set; }
        public Dictionary<string, object>? Payload { get; set; }
        public string? Topic { get; set; }
        public bool? Processed { get; set; }
        public string? Error { get; set; }
    }
}
