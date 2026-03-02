using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ActivityRecordQueryForm
    {
        public int? PageNum { get; set; }
        public int? PageSize { get; set; }
        public string? SortField { get; set; }
        public string? SortDirection { get; set; }
        public string? ActivityId { get; set; }
        public string? RecordType { get; set; }
        public int? Size { get; set; }
        public int? Page { get; set; }
    }
}
