using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class LoginForm
    {
        public string? Username { get; set; }
        public string? Password { get; set; }
        public string? Captcha { get; set; }
    }
}
