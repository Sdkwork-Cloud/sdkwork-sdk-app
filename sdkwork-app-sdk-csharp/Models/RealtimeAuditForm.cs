using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RealtimeAuditForm
    {
        public string? StreamId { get; set; }
        public string? StreamUrl { get; set; }
        public string? StreamType { get; set; }
        public string? RoomId { get; set; }
        public string? PublisherId { get; set; }
        public List<string>? CheckTypes { get; set; }
        public string? CallbackUrl { get; set; }
        public bool? CheckAudio { get; set; }
        public bool? CheckVideo { get; set; }
    }
}
