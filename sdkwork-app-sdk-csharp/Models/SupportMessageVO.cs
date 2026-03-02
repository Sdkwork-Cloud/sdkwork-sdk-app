using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SupportMessageVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? SessionId { get; set; }
        public string? Content { get; set; }
        public string? AttachmentUrl { get; set; }
        public string? SenderType { get; set; }
        public string? SendTime { get; set; }
        public bool? Read { get; set; }
    }
}
