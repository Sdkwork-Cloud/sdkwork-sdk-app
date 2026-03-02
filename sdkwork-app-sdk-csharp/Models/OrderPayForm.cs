using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OrderPayForm
    {
        public string? OrderId { get; set; }
        public string? PaymentMethod { get; set; }
        public string? Amount { get; set; }
        public string? PaymentPassword { get; set; }
        public string? ClientIp { get; set; }
    }
}
