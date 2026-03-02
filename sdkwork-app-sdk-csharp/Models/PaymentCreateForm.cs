using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PaymentCreateForm
    {
        public string? OrderId { get; set; }
        public string? BusinessType { get; set; }
        public string? BusinessOrderId { get; set; }
        public string? Amount { get; set; }
        public string? PaymentMethod { get; set; }
        public string? PaymentScene { get; set; }
        public string? ClientIp { get; set; }
        public string? PaymentProvider { get; set; }
        public string? ProductType { get; set; }
    }
}
