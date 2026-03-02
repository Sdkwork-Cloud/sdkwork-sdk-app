using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RewardVerifyForm
    {
        public string? AdvertId { get; set; }
        public string? RewardId { get; set; }
        public string? VerificationToken { get; set; }
        public string? DeviceId { get; set; }
        public string? IpAddress { get; set; }
    }
}
