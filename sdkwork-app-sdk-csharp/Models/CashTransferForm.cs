using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CashTransferForm
    {
        public string? ToUserId { get; set; }
        public double? Amount { get; set; }
        public string? Remarks { get; set; }
        public string? PayPassword { get; set; }
    }
}
