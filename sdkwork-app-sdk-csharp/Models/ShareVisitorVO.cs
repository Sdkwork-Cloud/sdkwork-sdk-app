using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShareVisitorVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? VisitorId { get; set; }
        public string? VisitTime { get; set; }
        public string? UserAgent { get; set; }
        public string? IpAddress { get; set; }
        public string? DeviceInfo { get; set; }
        public string? VisitType { get; set; }
    }
}
