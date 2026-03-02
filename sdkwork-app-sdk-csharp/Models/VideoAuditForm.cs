using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VideoAuditForm
    {
        public string? VideoUrl { get; set; }
        public string? ContentId { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? ContentType { get; set; }
        public List<string>? CheckTypes { get; set; }
        public string? CallbackUrl { get; set; }
        public int? Duration { get; set; }
    }
}
