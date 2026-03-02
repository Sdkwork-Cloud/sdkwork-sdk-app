using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ImageAuditForm
    {
        public string? ImageUrl { get; set; }
        public string? ImageBase64 { get; set; }
        public string? ContentId { get; set; }
        public string? ContentType { get; set; }
        public List<string>? CheckTypes { get; set; }
        public string? Scene { get; set; }
        public bool? Async { get; set; }
    }
}
