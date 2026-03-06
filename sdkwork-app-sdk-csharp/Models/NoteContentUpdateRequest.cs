using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NoteContentUpdateRequest
    {
        public string? Text { get; set; }
        public Dictionary<string, string>? Contents { get; set; }
        public string? Prompt { get; set; }
        public string? ThinkingContent { get; set; }
        public string? Encoding { get; set; }
        public bool? BumpVersion { get; set; }
    }
}
