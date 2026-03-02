using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CurrencyVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Code { get; set; }
        public string? Name { get; set; }
        public string? Symbol { get; set; }
        public string? CurrencyType { get; set; }
        public int? PrecisionDigits { get; set; }
        public bool? IsActive { get; set; }
        public string? Description { get; set; }
    }
}
