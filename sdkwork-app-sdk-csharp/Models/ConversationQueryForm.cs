using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ConversationQueryForm
    {
        public int? Page { get; set; }
        public int? Size { get; set; }
        public string? ConversationType { get; set; }
        public bool? ShowUnread { get; set; }
        public string? Keyword { get; set; }
    }
}
