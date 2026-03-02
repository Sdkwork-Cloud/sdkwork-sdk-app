using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipBenefitVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Name { get; set; }
        public string? BenefitKey { get; set; }
        public string? Type { get; set; }
        public string? Description { get; set; }
        public string? Icon { get; set; }
        public bool? Claimed { get; set; }
        public int? UsageLimit { get; set; }
        public int? UsedCount { get; set; }
    }
}
