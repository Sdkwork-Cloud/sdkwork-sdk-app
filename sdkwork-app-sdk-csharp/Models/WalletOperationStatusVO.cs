using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class WalletOperationStatusVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RequestNo { get; set; }
        public bool? Found { get; set; }
        public bool? Completed { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public string? TransactionId { get; set; }
        public string? OperationType { get; set; }
        public string? AccountType { get; set; }
        public string? ProcessedAt { get; set; }
        public List<string>? RelatedTransactionIds { get; set; }
        public List<HistoryVO>? Details { get; set; }
        public string? ResultDesc { get; set; }
    }
}
