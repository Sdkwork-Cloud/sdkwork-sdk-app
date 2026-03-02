using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AccountRiskCheckForm
    {
        public string? UserId { get; set; }
        public string? DeviceId { get; set; }
        public string? IpAddress { get; set; }
        public string? Scene { get; set; }
        public string? Location { get; set; }
    }
}
