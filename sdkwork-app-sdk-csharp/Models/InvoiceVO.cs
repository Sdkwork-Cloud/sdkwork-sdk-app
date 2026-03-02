using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class InvoiceVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? InvoiceId { get; set; }
        public string? Title { get; set; }
        public string? TitleType { get; set; }
        public string? TaxNo { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public string? InvoiceCode { get; set; }
        public string? InvoiceNo { get; set; }
        public double? TotalAmount { get; set; }
        public string? Currency { get; set; }
    }
}
