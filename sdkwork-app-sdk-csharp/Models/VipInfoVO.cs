using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipInfoVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? VipLevel { get; set; }
        public string? VipLevelName { get; set; }
        public string? VipStatus { get; set; }
        public string? EffectiveTime { get; set; }
        public string? ExpireTime { get; set; }
        public int? RemainingDays { get; set; }
        public int? TotalDays { get; set; }
        public int? TotalSpent { get; set; }
        public int? VipPoints { get; set; }
        public int? GrowthValue { get; set; }
        public int? UpgradeGrowthValue { get; set; }
        public CustomerServiceInfo? CustomerService { get; set; }
        public List<VipBenefitVO>? Benefits { get; set; }
        public List<VipCouponVO>? Coupons { get; set; }
    }
}
