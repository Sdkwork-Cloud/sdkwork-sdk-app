using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DeviceRegisterForm
    {
        public string? DeviceType { get; set; }
        public string? DeviceId { get; set; }
        public string? PushToken { get; set; }
        public string? OsVersion { get; set; }
        public string? AppVersion { get; set; }
    }
}
