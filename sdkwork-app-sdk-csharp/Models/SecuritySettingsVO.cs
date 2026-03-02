using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SecuritySettingsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? TwoFactorEnabled { get; set; }
        public bool? BiometricEnabled { get; set; }
        public bool? AutoLockEnabled { get; set; }
        public int? AutoLockMinutes { get; set; }
        public bool? LoginNotificationsEnabled { get; set; }
        public bool? IpRestrictionEnabled { get; set; }
        public List<string>? AllowedIps { get; set; }
        public bool? PasswordStrengthCheckEnabled { get; set; }
        public int? PasswordExpiryDays { get; set; }
        public string? LastPasswordChangeTime { get; set; }
    }
}
