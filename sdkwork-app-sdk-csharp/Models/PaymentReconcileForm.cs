using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PaymentReconcileForm
    {
        public string? OrderId { get; set; }
        public string? OutTradeNo { get; set; }
        public string? ReconcileType { get; set; }
    }
}
