using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AuditResultItem
    {
        public string? Type { get; set; }
        public string? Result { get; set; }
        public string? RiskLevel { get; set; }
        public double? Confidence { get; set; }
    }
}
