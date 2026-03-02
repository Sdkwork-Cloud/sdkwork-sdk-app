using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ChatMessageSendForm
    {
        public int? SessionId { get; set; }
        public string? Content { get; set; }
        public string? Type { get; set; }
        public string? Format { get; set; }
        public int? QuoteMessageId { get; set; }
        public bool? NeedThinking { get; set; }
        public bool? Streaming { get; set; }
        public string? ModelId { get; set; }
        public string? SystemPrompt { get; set; }
        public double? Temperature { get; set; }
        public int? MaxTokens { get; set; }
        public double? TopP { get; set; }
    }
}
