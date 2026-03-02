using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PrivateMessageVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? MessageId { get; set; }
        public string? SenderId { get; set; }
        public string? RecipientId { get; set; }
        public string? Content { get; set; }
        public string? MessageType { get; set; }
        public string? SendTime { get; set; }
        public bool? IsRead { get; set; }
        public string? AttachmentUrl { get; set; }
    }
}
