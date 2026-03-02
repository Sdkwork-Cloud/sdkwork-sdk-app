using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DeviceVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? DeviceId { get; set; }
        public string? DeviceType { get; set; }
        public string? DeviceName { get; set; }
        public string? PushToken { get; set; }
        public string? OsVersion { get; set; }
        public string? AppVersion { get; set; }
        public bool? IsActive { get; set; }
        public string? RegisterTime { get; set; }
        public string? LastActiveAt { get; set; }
    }
}
