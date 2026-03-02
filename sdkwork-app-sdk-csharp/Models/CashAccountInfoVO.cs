using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CashAccountInfoVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? AccountId { get; set; }
        public string? AccountType { get; set; }
        public string? AccountTypeName { get; set; }
        public string? OwnerId { get; set; }
        public string? UserId { get; set; }
        public double? AvailableBalance { get; set; }
        public double? FrozenBalance { get; set; }
        public double? TotalBalance { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public double? PendingBalance { get; set; }
        public double? TotalRecharged { get; set; }
        public double? TotalSpent { get; set; }
        public double? TotalWithdrawn { get; set; }
    }
}
