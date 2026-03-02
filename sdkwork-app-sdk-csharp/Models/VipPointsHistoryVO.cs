using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipPointsHistoryVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? ChangeType { get; set; }
        public int? ChangeAmount { get; set; }
        public int? BeforeBalance { get; set; }
        public int? AfterBalance { get; set; }
        public string? SourceType { get; set; }
        public string? Remark { get; set; }
    }
}
