using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PartnerVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? PartnerId { get; set; }
        public string? Name { get; set; }
        public string? Level { get; set; }
        public string? Status { get; set; }
        public string? PromotionCode { get; set; }
        public string? ContactName { get; set; }
        public string? ContactPhone { get; set; }
        public double? TotalCommission { get; set; }
        public double? WithdrawableCommission { get; set; }
    }
}
