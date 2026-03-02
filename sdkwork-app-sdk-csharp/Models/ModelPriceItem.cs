using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ModelPriceItem
    {
        public string? Type { get; set; }
        public double? Price { get; set; }
    }
}
