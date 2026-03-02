using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class HistoryQueryForm
    {
        public string? TransactionType { get; set; }
        public string? Status { get; set; }
        public string? StartDate { get; set; }
        public string? EndDate { get; set; }
        public int? PageNum { get; set; }
        public int? PageSize { get; set; }
        public string? SortField { get; set; }
        public string? SortDirection { get; set; }
    }
}
