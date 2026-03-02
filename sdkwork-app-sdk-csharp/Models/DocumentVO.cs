using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DocumentVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? DocumentId { get; set; }
        public string? DocumentUuid { get; set; }
        public string? Title { get; set; }
        public string? FolderId { get; set; }
        public string? AssetType { get; set; }
        public string? MimeType { get; set; }
        public string? Description { get; set; }
        public List<string>? Tags { get; set; }
        public string? Status { get; set; }
        public string? Summary { get; set; }
        public int? WordCount { get; set; }
        public int? CharCount { get; set; }
    }
}
