using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DriveContentVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? FileId { get; set; }
        public string? FileUuid { get; set; }
        public string? FileVersion { get; set; }
        public string? ContentId { get; set; }
        public string? Encoding { get; set; }
        public string? Prompt { get; set; }
        public string? ThinkingContent { get; set; }
        public string? Text { get; set; }
        public Dictionary<string, string>? Contents { get; set; }
    }
}
