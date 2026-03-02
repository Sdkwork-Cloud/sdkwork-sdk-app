using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class InvoiceStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalInvoices { get; set; }
        public int? PendingInvoices { get; set; }
        public int? CompletedInvoices { get; set; }
        public double? TotalAmount { get; set; }
    }
}
