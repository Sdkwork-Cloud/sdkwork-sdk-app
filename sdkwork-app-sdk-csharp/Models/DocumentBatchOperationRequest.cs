using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DocumentBatchOperationRequest
    {
        public string? Type { get; set; }
        public int? Index { get; set; }
        public int? StartIndex { get; set; }
        public int? EndIndex { get; set; }
        public string? Text { get; set; }
        public string? SearchText { get; set; }
        public string? ReplaceText { get; set; }
    }
}
