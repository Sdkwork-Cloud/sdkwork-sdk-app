using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SupportMessageRequest
    {
        public string? SessionId { get; set; }
        public string? Content { get; set; }
        public string? AttachmentUrl { get; set; }
    }
}
