using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class WalletOperationResultVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RequestNo { get; set; }
        public string? TransactionId { get; set; }
        public string? OperationType { get; set; }
        public string? AccountType { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public string? FromAccountId { get; set; }
        public string? ToAccountId { get; set; }
        public double? Amount { get; set; }
        public int? Points { get; set; }
        public int? Tokens { get; set; }
        public double? FromBalanceAfter { get; set; }
        public double? ToBalanceAfter { get; set; }
        public int? FromPointsAfter { get; set; }
        public int? ToPointsAfter { get; set; }
        public int? TokenAfter { get; set; }
        public double? FrozenBalance { get; set; }
        public string? Channel { get; set; }
        public string? ResultDesc { get; set; }
        public string? ProcessedAt { get; set; }
    }
}
