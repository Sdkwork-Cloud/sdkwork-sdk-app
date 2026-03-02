using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SendMessageForm
    {
        public string? RecipientId { get; set; }
        public string? Content { get; set; }
        public string? MessageType { get; set; }
        public string? ConversationId { get; set; }
        public string? AttachmentUrl { get; set; }
    }
}
