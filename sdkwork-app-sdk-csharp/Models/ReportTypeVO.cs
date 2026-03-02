using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ReportTypeVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ReportTypeId { get; set; }
        public string? ReportName { get; set; }
        public string? ReportType { get; set; }
        public string? Description { get; set; }
        public bool? Enabled { get; set; }
        public string? Icon { get; set; }
    }
}
