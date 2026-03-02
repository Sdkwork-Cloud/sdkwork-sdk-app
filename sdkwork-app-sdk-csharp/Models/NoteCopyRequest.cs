using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NoteCopyRequest
    {
        public string? FolderId { get; set; }
        public string? Title { get; set; }
    }
}
