using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TopicSubscribeForm
    {
        public string? Topic { get; set; }
        public bool? Subscribe { get; set; }
        public string? DeviceId { get; set; }
    }
}
