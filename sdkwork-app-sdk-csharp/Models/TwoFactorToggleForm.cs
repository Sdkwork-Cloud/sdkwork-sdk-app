using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TwoFactorToggleForm
    {
        public bool? Enable { get; set; }
        public string? Method { get; set; }
        public string? VerificationCode { get; set; }
    }
}
