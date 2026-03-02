using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShareVerifyForm
    {
        public string? ShareId { get; set; }
        public string? Password { get; set; }
        public string? VerificationCode { get; set; }
    }
}
