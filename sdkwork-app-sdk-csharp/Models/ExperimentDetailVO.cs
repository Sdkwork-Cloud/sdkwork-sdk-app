using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ExperimentDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ExperimentKey { get; set; }
        public string? ExperimentName { get; set; }
        public string? ExperimentDescription { get; set; }
        public string? Status { get; set; }
        public List<Dictionary<string, object>>? Variants { get; set; }
        public Dictionary<string, object>? Config { get; set; }
    }
}
