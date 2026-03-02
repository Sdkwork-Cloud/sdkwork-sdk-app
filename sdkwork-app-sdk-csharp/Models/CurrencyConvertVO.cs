using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CurrencyConvertVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? BaseCurrencyCode { get; set; }
        public string? TargetCurrencyCode { get; set; }
        public double? OriginalAmount { get; set; }
        public double? Rate { get; set; }
        public double? ConvertedAmount { get; set; }
    }
}
