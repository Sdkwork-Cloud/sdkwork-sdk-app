using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ChatMessageQueryForm
    {
        public int? SessionId { get; set; }
        public int? MessageId { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
        public string? Sort { get; set; }
    }
}
