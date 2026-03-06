using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OrderItemForm
    {
        public string? ProductId { get; set; }
        public string? SkuId { get; set; }
        public int? Quantity { get; set; }
        public string? Price { get; set; }
        public string? ProductName { get; set; }
        public string? ContentType { get; set; }
        public string? ContentId { get; set; }
    }
}
