using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AuditRecordVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RecordId { get; set; }
        public string? ContentId { get; set; }
        public string? ContentType { get; set; }
        public string? ContentPreview { get; set; }
        public string? Result { get; set; }
        public string? RiskLevel { get; set; }
        public List<string>? CheckTypes { get; set; }
        public List<string>? ViolationTypes { get; set; }
        public string? AuditTime { get; set; }
        public int? ProcessTime { get; set; }
    }
}
