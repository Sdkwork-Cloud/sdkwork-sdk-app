using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AudioAuditForm
    {
        public string? AudioUrl { get; set; }
        public string? Format { get; set; }
        public string? ContentId { get; set; }
        public int? Duration { get; set; }
        public List<string>? CheckTypes { get; set; }
        public int? SampleRate { get; set; }
    }
}
