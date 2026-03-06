using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class WalletOverviewVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? UserId { get; set; }
        public string? SnapshotAt { get; set; }
        public double? CashAvailable { get; set; }
        public double? CashFrozen { get; set; }
        public int? PointsAvailable { get; set; }
        public int? PointsFrozen { get; set; }
        public int? TokenAvailable { get; set; }
        public int? TokenFrozen { get; set; }
        public List<WalletAssetAccountVO>? Accounts { get; set; }
    }
}
