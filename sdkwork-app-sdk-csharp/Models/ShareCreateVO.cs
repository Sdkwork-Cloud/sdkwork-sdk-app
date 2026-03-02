using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShareCreateVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ShareId { get; set; }
        public string? ShareUrl { get; set; }
        public string? QrCode { get; set; }
        public string? ExpireTime { get; set; }
        public string? Password { get; set; }
    }
}
