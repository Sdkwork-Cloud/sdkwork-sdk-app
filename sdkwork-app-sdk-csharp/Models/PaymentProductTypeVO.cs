using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PaymentProductTypeVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Code { get; set; }
        public string? Name { get; set; }
        public bool? Available { get; set; }
    }
}
