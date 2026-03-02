using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class QrCodeStatusVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Status { get; set; }
        public UserInfoVO? UserInfo { get; set; }
        public LoginVO? Token { get; set; }
    }
}
