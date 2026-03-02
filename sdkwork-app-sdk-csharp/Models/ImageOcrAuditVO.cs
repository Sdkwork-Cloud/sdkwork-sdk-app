using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ImageOcrAuditVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TaskId { get; set; }
        public string? OcrText { get; set; }
        public List<TextBlock>? TextBlocks { get; set; }
        public TextAuditVO? TextAuditResult { get; set; }
        public string? OverallResult { get; set; }
    }
}
