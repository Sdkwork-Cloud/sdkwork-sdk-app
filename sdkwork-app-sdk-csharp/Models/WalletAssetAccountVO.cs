using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class WalletAssetAccountVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? AccountId { get; set; }
        public string? AccountType { get; set; }
        public string? AccountTypeName { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public double? AvailableBalance { get; set; }
        public double? FrozenBalance { get; set; }
        public int? AvailablePoints { get; set; }
        public int? FrozenPoints { get; set; }
        public int? AvailableToken { get; set; }
        public int? FrozenToken { get; set; }
    }
}
