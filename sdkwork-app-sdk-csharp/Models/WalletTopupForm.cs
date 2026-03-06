using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class WalletTopupForm
    {
        public double? Amount { get; set; }
        public string? PaymentMethod { get; set; }
        public string? RequestNo { get; set; }
        public string? Remarks { get; set; }
    }
}
