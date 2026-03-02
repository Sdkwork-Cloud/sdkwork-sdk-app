using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ThirdPartyBindForm
    {
        public string? Platform { get; set; }
        public string? Code { get; set; }
        public string? ThirdPartyUserId { get; set; }
        public string? ThirdPartyUserName { get; set; }
        public string? ThirdPartyAvatar { get; set; }
        public string? AccessToken { get; set; }
        public string? RefreshToken { get; set; }
        public string? ExpireTime { get; set; }
    }
}
