using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class InvoiceItemVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ItemId { get; set; }
        public string? ProductName { get; set; }
        public string? Specification { get; set; }
        public string? Unit { get; set; }
        public double? Quantity { get; set; }
        public double? UnitPriceExcludingTax { get; set; }
        public double? AmountExcludingTax { get; set; }
        public double? TaxAmount { get; set; }
        public double? TotalAmount { get; set; }
        public double? TaxRate { get; set; }
    }
}
