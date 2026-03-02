using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OAuthLoginForm
    {
        public string? Provider { get; set; }
        public string? Code { get; set; }
        public string? State { get; set; }
        public string? DeviceId { get; set; }
        public string? DeviceType { get; set; }
    }
}
