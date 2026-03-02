using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CashWithdrawVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TransactionId { get; set; }
        public string? AccountId { get; set; }
        public double? Amount { get; set; }
        public double? BalanceAfter { get; set; }
        public double? FrozenBalance { get; set; }
        public string? Status { get; set; }
        public string? EstimatedArrivalTime { get; set; }
        public string? WithdrawMethod { get; set; }
    }
}
