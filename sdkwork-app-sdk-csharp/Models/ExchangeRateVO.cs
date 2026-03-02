using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ExchangeRateVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? BaseCurrencyCode { get; set; }
        public string? BaseCurrencyName { get; set; }
        public string? TargetCurrencyCode { get; set; }
        public string? TargetCurrencyName { get; set; }
        public double? Rate { get; set; }
        public string? EffectiveDate { get; set; }
    }
}
