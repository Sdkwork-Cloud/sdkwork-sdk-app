using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class HistoryVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? HistoryId { get; set; }
        public string? AccountId { get; set; }
        public string? TransactionType { get; set; }
        public string? TransactionTypeName { get; set; }
        public double? Amount { get; set; }
        public int? Points { get; set; }
        public int? Tokens { get; set; }
        public double? BalanceBefore { get; set; }
        public double? BalanceAfter { get; set; }
        public int? PointsBefore { get; set; }
        public int? PointsAfter { get; set; }
        public string? TransactionId { get; set; }
        public string? RelatedId { get; set; }
        public string? RelatedType { get; set; }
        public string? Remarks { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public string? CounterpartyAccountId { get; set; }
        public string? CounterpartyUserId { get; set; }
        public string? CounterpartyUserName { get; set; }
    }
}
