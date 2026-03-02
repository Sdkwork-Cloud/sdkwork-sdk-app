using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AuditAppealStatusVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? AppealId { get; set; }
        public string? RecordId { get; set; }
        public string? CurrentStatus { get; set; }
        public string? StatusDescription { get; set; }
        public int? Progress { get; set; }
        public string? EstimatedCompleteTime { get; set; }
        public string? Result { get; set; }
        public bool? CanAddEvidence { get; set; }
        public bool? CanCancel { get; set; }
    }
}
