using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ChatSessionUpdateForm
    {
        public int? SessionId { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? ModelId { get; set; }
        public string? SystemPrompt { get; set; }
        public double? Temperature { get; set; }
        public int? MaxTokens { get; set; }
        public double? TopP { get; set; }
        public string? Status { get; set; }
    }
}
