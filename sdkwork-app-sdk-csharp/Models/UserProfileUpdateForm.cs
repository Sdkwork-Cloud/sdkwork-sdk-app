using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserProfileUpdateForm
    {
        public string? Nickname { get; set; }
        public string? Avatar { get; set; }
        public string? Gender { get; set; }
        public string? Birthday { get; set; }
        public string? Region { get; set; }
        public string? Bio { get; set; }
        public string? Occupation { get; set; }
        public string? Interests { get; set; }
        public string? Phone { get; set; }
        public string? Email { get; set; }
        public string? VerifyCode { get; set; }
    }
}
