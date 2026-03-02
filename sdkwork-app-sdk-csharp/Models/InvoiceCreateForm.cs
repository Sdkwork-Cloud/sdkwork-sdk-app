using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class InvoiceCreateForm
    {
        public string? Title { get; set; }
        public string? TitleType { get; set; }
        public string? TaxNo { get; set; }
        public string? Type { get; set; }
        public double? TotalAmount { get; set; }
    }
}
