using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ConversationVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ConversationId { get; set; }
        public string? ConversationType { get; set; }
        public string? OtherUserId { get; set; }
        public string? OtherUsername { get; set; }
        public string? OtherNickname { get; set; }
        public string? OtherAvatar { get; set; }
        public string? LastMessage { get; set; }
        public string? LastMessageTime { get; set; }
        public int? UnreadCount { get; set; }
        public bool? IsTop { get; set; }
    }
}
