using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ChatMessageVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public int? SessionId { get; set; }
        public string? Content { get; set; }
        public string? Type { get; set; }
        public string? Format { get; set; }
        public string? Status { get; set; }
        public string? SenderType { get; set; }
        public string? SenderId { get; set; }
        public string? ReceiverId { get; set; }
        public int? QuoteMessageId { get; set; }
        public string? Thinking { get; set; }
        public string? ModelId { get; set; }
        public int? ResponseTime { get; set; }
        public int? TokenCount { get; set; }
        public List<AttachmentVO>? Attachments { get; set; }
        public string? CreateTime { get; set; }
        public string? UpdateTime { get; set; }
    }
}
