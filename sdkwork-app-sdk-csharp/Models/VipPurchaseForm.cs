using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipPurchaseForm
    {
        public int? PackId { get; set; }
        public string? CouponId { get; set; }
        public string? PaymentMethod { get; set; }
    }
}
