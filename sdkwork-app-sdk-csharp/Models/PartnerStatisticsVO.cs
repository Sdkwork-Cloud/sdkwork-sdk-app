using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PartnerStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalPartners { get; set; }
        public int? ActivePartners { get; set; }
        public int? PendingPartners { get; set; }
        public double? TotalCommission { get; set; }
        public double? WithdrawableCommission { get; set; }
    }
}
