using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShareVerifyVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? Valid { get; set; }
        public string? ErrorMessage { get; set; }
        public ShareInfoVO? ShareInfo { get; set; }
    }
}
