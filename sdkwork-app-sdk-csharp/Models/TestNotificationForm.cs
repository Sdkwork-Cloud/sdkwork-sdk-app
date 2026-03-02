using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TestNotificationForm
    {
        public string? Title { get; set; }
        public string? Content { get; set; }
        public string? Type { get; set; }
        public string? DeviceId { get; set; }
    }
}
