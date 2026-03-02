using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShareVisitForm
    {
        public string? ShareId { get; set; }
        public string? VisitType { get; set; }
        public string? UserAgent { get; set; }
        public string? IpAddress { get; set; }
        public string? DeviceInfo { get; set; }
    }
}
