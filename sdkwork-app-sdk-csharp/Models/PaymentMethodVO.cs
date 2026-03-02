using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PaymentMethodVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Code { get; set; }
        public string? MethodId { get; set; }
        public string? MethodName { get; set; }
        public string? MethodIcon { get; set; }
        public bool? Enabled { get; set; }
        public int? Sort { get; set; }
        public string? Icon { get; set; }
        public bool? Available { get; set; }
        public List<PaymentProductTypeVO>? ProductTypes { get; set; }
    }
}
