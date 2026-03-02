using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CartGroupVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Uuid { get; set; }
        public string? Name { get; set; }
        public List<CartItemVO>? Items { get; set; }
        public int? TotalQuantity { get; set; }
        public double? TotalPrice { get; set; }
    }
}
