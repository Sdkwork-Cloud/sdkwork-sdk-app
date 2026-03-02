using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MyAuditRecordQueryForm
    {
        public int? PageNum { get; set; }
        public int? PageSize { get; set; }
        public string? SortField { get; set; }
        public string? SortDirection { get; set; }
        public string? ContentType { get; set; }
        public string? Result { get; set; }
        public string? StartDate { get; set; }
        public string? EndDate { get; set; }
        public int? Size { get; set; }
        public int? Page { get; set; }
    }
}
