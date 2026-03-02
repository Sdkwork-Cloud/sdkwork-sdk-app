using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ExchangeRateCreateForm
    {
        public string? BaseCurrencyCode { get; set; }
        public string? TargetCurrencyCode { get; set; }
        public double? Rate { get; set; }
        public string? EffectiveDate { get; set; }
    }
}
