using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FileSystemFileCreateForm
    {
        public string? Name { get; set; }
        public string? ParentId { get; set; }
        public string? DiskId { get; set; }
        public string? MimeType { get; set; }
        public string? AssetType { get; set; }
        public string? Description { get; set; }
        public List<string>? Tags { get; set; }
        public string? Text { get; set; }
        public Dictionary<string, string>? Contents { get; set; }
        public string? Prompt { get; set; }
        public string? ThinkingContent { get; set; }
        public string? Encoding { get; set; }
    }
}
