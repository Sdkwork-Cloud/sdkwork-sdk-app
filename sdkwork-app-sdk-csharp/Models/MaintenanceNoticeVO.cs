using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MaintenanceNoticeVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? NoticeId { get; set; }
        public string? Title { get; set; }
        public string? Content { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public string? Status { get; set; }
        public string? MaintenanceType { get; set; }
        public string? AffectedServices { get; set; }
        public string? ContactInfo { get; set; }
        public bool? IsEmergency { get; set; }
    }
}
