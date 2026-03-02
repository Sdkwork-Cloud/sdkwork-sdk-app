using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BatchImageAuditVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? BatchId { get; set; }
        public List<ImageAuditItem>? Results { get; set; }
        public string? OverallStatus { get; set; }
        public int? TotalCount { get; set; }
        public int? PassCount { get; set; }
        public int? RejectCount { get; set; }
    }
}
