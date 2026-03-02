using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DocumentUpdateRequest
    {
        public string? Title { get; set; }
        public string? FolderId { get; set; }
        public string? Description { get; set; }
        public List<string>? Tags { get; set; }
    }
}
