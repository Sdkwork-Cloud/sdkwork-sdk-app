using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PaymentParamsVO
    {
        public string? OrderId { get; set; }
        public string? PaymentId { get; set; }
        public string? OutTradeNo { get; set; }
        public string? Amount { get; set; }
        public string? PaymentMethod { get; set; }
        public Dictionary<string, object>? PaymentParams { get; set; }
    }
}
