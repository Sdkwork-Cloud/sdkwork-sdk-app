using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TenantStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalTenants { get; set; }
        public int? ActiveTenants { get; set; }
        public int? FrozenTenants { get; set; }
        public int? ClosedTenants { get; set; }
    }
}
