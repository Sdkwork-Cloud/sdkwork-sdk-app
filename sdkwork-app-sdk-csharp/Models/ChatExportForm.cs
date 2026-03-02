using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ChatExportForm
    {
        public string? Format { get; set; }
        public string? Scope { get; set; }
        public int? Count { get; set; }
        public bool? IncludeThinking { get; set; }
        public bool? IncludeSystemMessages { get; set; }
        public bool? IncludeAttachments { get; set; }
        public string? FileName { get; set; }
    }
}
