using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserActivityVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ActivityId { get; set; }
        public string? UserId { get; set; }
        public string? ActivityType { get; set; }
        public string? ActivityName { get; set; }
        public string? Timestamp { get; set; }
        public string? DeviceId { get; set; }
        public string? IpAddress { get; set; }
        public string? PageUrl { get; set; }
        public string? Referrer { get; set; }
    }
}
