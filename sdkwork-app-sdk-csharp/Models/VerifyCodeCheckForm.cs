using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VerifyCodeCheckForm
    {
        public string? Target { get; set; }
        public string? Type { get; set; }
        public string? VerifyType { get; set; }
        public string? Code { get; set; }
    }
}
