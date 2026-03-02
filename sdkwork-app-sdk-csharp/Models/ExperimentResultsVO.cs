using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ExperimentResultsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ExperimentKey { get; set; }
        public List<Dictionary<string, object>>? Results { get; set; }
        public Dictionary<string, object>? Statistics { get; set; }
        public string? Status { get; set; }
        public string? GeneratedAt { get; set; }
    }
}
