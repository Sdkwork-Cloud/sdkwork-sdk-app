using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PhoneLoginForm
    {
        public string? Phone { get; set; }
        public string? Code { get; set; }
        public string? DeviceId { get; set; }
        public string? DeviceType { get; set; }
        public string? DeviceName { get; set; }
        public string? AppVersion { get; set; }
    }
}
