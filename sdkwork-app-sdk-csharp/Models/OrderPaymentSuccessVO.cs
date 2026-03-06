using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OrderPaymentSuccessVO
    {
        public string? OrderId { get; set; }
        public string? OutTradeNo { get; set; }
        public bool? Paid { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
    }
}
