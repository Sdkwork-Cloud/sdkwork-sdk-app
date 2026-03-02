using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DocumentCopyRequest
    {
        public string? FolderId { get; set; }
        public string? Title { get; set; }
    }
}
