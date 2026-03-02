using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AuditAppealVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? AppealId { get; set; }
        public string? RecordId { get; set; }
        public string? Reason { get; set; }
        public string? Description { get; set; }
        public string? EvidenceUrl { get; set; }
        public string? Status { get; set; }
        public string? Result { get; set; }
        public string? Comment { get; set; }
        public string? SubmitTime { get; set; }
        public string? ProcessTime { get; set; }
    }
}
