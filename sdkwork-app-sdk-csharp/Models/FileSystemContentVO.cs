using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FileSystemContentVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? NodeId { get; set; }
        public string? NodeUuid { get; set; }
        public string? ContentId { get; set; }
        public string? FileVersion { get; set; }
        public string? Encoding { get; set; }
        public string? Prompt { get; set; }
        public string? ThinkingContent { get; set; }
        public string? Text { get; set; }
        public Dictionary<string, string>? Contents { get; set; }
        public int? CharCount { get; set; }
        public int? WordCount { get; set; }
    }
}
