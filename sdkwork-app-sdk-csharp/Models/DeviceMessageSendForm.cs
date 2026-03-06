using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DeviceMessageSendForm
    {
        public string? Type { get; set; }
        public Dictionary<string, object>? Payload { get; set; }
        public string? Topic { get; set; }
    }
}
