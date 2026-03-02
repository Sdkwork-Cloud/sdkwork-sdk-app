using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VerifyCodeSendForm
    {
        public string? Target { get; set; }
        public string? Type { get; set; }
        public string? VerifyType { get; set; }
        public string? DeviceId { get; set; }
    }
}
