using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AuditAppealForm
    {
        public string? Reason { get; set; }
        public string? Description { get; set; }
        public string? EvidenceUrl { get; set; }
        public string? ContactEmail { get; set; }
        public string? ExpectedAction { get; set; }
    }
}
