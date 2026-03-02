using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PasswordResetRequestForm
    {
        public string? Account { get; set; }
        public string? Channel { get; set; }
        public string? DeviceId { get; set; }
        public string? Locale { get; set; }
        public string? RedirectUri { get; set; }
    }
}
