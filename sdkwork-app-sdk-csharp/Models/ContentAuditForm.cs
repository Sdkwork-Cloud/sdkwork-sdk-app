using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ContentAuditForm
    {
        public string? ContentId { get; set; }
        public string? TextContent { get; set; }
        public List<string>? ImageUrls { get; set; }
        public string? VideoUrl { get; set; }
        public string? AudioUrl { get; set; }
        public string? ContentType { get; set; }
        public string? Scene { get; set; }
        public List<string>? CheckTypes { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public string? UserId { get; set; }
    }
}
