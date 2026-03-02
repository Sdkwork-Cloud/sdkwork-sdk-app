using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Status { get; set; }
        public string? Level { get; set; }
        public string? StartedAt { get; set; }
        public string? ExpiredAt { get; set; }
        public int? RemainingDays { get; set; }
        public int? TotalDays { get; set; }
        public List<VipPrivilegeVO>? Privileges { get; set; }
        public VipRenewalVO? RenewalInfo { get; set; }
        public VipUpgradeVO? UpgradeInfo { get; set; }
    }
}
