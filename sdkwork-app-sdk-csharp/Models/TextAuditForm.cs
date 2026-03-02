using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TextAuditForm
    {
        public string? Content { get; set; }
        public string? ContentId { get; set; }
        public string? ContentType { get; set; }
        public string? Scene { get; set; }
        public string? UserId { get; set; }
        public List<string>? CheckTypes { get; set; }
        public bool? Async { get; set; }
    }
}
