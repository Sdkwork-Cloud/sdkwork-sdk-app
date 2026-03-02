using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShoppingCartVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? CartId { get; set; }
        public string? Uuid { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Owner { get; set; }
        public int? OwnerId { get; set; }
        public string? Status { get; set; }
        public List<CartGroupVO>? Groups { get; set; }
        public int? TotalQuantity { get; set; }
        public double? TotalPrice { get; set; }
        public int? SelectedQuantity { get; set; }
        public double? SelectedPrice { get; set; }
    }
}
