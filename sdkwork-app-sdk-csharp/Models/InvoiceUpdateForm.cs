using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class InvoiceUpdateForm
    {
        public string? Title { get; set; }
        public string? TaxNo { get; set; }
        public string? BankName { get; set; }
        public string? BankAccount { get; set; }
        public string? RegisterAddress { get; set; }
        public string? RegisterPhone { get; set; }
    }
}
