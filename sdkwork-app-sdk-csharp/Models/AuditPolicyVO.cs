using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AuditPolicyVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? PolicyId { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public List<string>? Scenes { get; set; }
        public List<DetectionTypeConfig>? DetectionTypes { get; set; }
        public Dictionary<string, double>? Thresholds { get; set; }
        public bool? Enabled { get; set; }
        public int? Priority { get; set; }
    }
}
