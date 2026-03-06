using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NoteBatchUpdateResultVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? NoteId { get; set; }
        public string? NoteUuid { get; set; }
        public string? VersionId { get; set; }
        public int? AppliedCount { get; set; }
        public int? SkippedCount { get; set; }
        public int? CharCount { get; set; }
        public int? WordCount { get; set; }
    }
}
