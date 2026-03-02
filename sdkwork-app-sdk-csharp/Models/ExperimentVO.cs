using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ExperimentVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ExperimentKey { get; set; }
        public string? ExperimentName { get; set; }
        public string? ExperimentDescription { get; set; }
        public string? Status { get; set; }
    }
}
