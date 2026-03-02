using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CurrencyConvertForm
    {
        public string? BaseCurrencyCode { get; set; }
        public string? TargetCurrencyCode { get; set; }
        public double? Amount { get; set; }
    }
}
