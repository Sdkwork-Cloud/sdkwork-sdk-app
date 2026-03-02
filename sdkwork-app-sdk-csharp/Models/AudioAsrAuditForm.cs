using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AudioAsrAuditForm
    {
        public string? AudioUrl { get; set; }
        public string? ContentId { get; set; }
        public string? Language { get; set; }
        public List<string>? CheckTypes { get; set; }
        public bool? WithTimestamp { get; set; }
    }
}
