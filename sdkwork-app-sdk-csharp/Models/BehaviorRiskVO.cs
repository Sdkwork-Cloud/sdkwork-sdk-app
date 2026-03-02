using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BehaviorRiskVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? UserId { get; set; }
        public string? BehaviorType { get; set; }
        public string? RiskLevel { get; set; }
        public int? RiskScore { get; set; }
        public List<AnomalyPattern>? Anomalies { get; set; }
        public FrequencyStats? FrequencyStats { get; set; }
        public string? Suggestion { get; set; }
        public List<string>? Restrictions { get; set; }
    }
}
