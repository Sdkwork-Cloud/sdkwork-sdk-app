using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class WalletTransferForm
    {
        public string? AccountType { get; set; }
        public string? ToUserId { get; set; }
        public double? Amount { get; set; }
        public int? Points { get; set; }
        public string? RequestNo { get; set; }
        public string? Remarks { get; set; }
    }
}
