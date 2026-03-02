using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RiskItem
    {
        public string? Type { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Level { get; set; }
        public double? Confidence { get; set; }
    }
}
