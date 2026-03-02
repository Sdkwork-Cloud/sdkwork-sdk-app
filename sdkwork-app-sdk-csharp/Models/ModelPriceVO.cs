using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ModelPriceVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Model { get; set; }
        public string? Unit { get; set; }
        public string? Currency { get; set; }
        public double? Price { get; set; }
        public double? InputPrice { get; set; }
        public double? OutputPrice { get; set; }
        public double? BatchInputPrice { get; set; }
        public double? BatchOutputPrice { get; set; }
        public double? CachedInputPrice { get; set; }
        public double? BatchCachedInputPrice { get; set; }
    }
}
