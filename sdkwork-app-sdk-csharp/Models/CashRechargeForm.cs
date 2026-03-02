using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CashRechargeForm
    {
        public double? Amount { get; set; }
        public string? PaymentMethod { get; set; }
        public string? Remarks { get; set; }
        public string? CouponId { get; set; }
    }
}
