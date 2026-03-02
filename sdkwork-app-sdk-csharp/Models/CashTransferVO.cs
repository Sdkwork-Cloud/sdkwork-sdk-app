using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CashTransferVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TransactionId { get; set; }
        public string? FromAccountId { get; set; }
        public string? ToAccountId { get; set; }
        public double? Amount { get; set; }
        public string? Status { get; set; }
        public double? FromBalanceAfter { get; set; }
        public double? ToBalanceAfter { get; set; }
    }
}
