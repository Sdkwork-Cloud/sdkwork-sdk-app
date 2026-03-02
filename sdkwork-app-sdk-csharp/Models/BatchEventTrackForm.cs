using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BatchEventTrackForm
    {
        public List<EventTrackForm>? Events { get; set; }
        public string? DeviceId { get; set; }
        public string? UserId { get; set; }
        public string? SubmitTime { get; set; }
    }
}
