using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PaymentQueryForm
    {
        public string? PaymentOrderId { get; set; }
        public string? MerchantOrderId { get; set; }
        public string? QueryType { get; set; }
        public string? Status { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
    }
}
