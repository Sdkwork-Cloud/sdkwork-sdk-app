using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TwoFactorSetupVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? Enabled { get; set; }
        public string? Method { get; set; }
        public string? QrCodeData { get; set; }
        public string? SecretKey { get; set; }
        public string? VerificationCode { get; set; }
        public List<string>? RecoveryCodes { get; set; }
    }
}
