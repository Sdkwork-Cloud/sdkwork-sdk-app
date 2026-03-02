using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ReportVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Type { get; set; }
        public string? TargetId { get; set; }
        public string? Status { get; set; }
        public string? SubmitTime { get; set; }
        public string? ProcessTime { get; set; }
    }
}
