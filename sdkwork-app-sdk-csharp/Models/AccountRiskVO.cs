using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AccountRiskVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? UserId { get; set; }
        public string? DeviceId { get; set; }
        public string? RiskLevel { get; set; }
        public int? RiskScore { get; set; }
        public List<RiskItem>? Risks { get; set; }
        public string? Suggestion { get; set; }
        public bool? NeedVerification { get; set; }
    }
}
