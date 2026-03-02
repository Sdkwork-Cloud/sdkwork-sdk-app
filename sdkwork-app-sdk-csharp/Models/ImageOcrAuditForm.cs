using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ImageOcrAuditForm
    {
        public string? ImageUrl { get; set; }
        public string? ContentId { get; set; }
        public List<string>? CheckTypes { get; set; }
        public string? Language { get; set; }
        public bool? ReturnFullText { get; set; }
    }
}
