using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ExperimentAssignmentVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ExperimentKey { get; set; }
        public string? VariantKey { get; set; }
        public string? VariantName { get; set; }
        public string? AssignmentReason { get; set; }
        public Dictionary<string, object>? AssignmentParams { get; set; }
    }
}
