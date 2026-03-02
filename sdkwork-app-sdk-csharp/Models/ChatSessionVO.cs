using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ChatSessionVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public string? ModelId { get; set; }
        public int? MessageCount { get; set; }
        public int? UnreadCount { get; set; }
        public string? LastMessageTime { get; set; }
        public string? LastMessageContent { get; set; }
        public string? CreateTime { get; set; }
        public string? UpdateTime { get; set; }
    }
}
