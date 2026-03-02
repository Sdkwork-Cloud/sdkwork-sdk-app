using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SupportInfoVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Hotline { get; set; }
        public string? Email { get; set; }
        public string? WorkingHours { get; set; }
        public string? WechatQrcode { get; set; }
        public string? OnlineSupportUrl { get; set; }
        public string? FaqUrl { get; set; }
        public string? HelpCenterUrl { get; set; }
    }
}
