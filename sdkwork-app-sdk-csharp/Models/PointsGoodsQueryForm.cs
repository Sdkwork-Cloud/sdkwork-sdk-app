using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PointsGoodsQueryForm
    {
        public int? PageNum { get; set; }
        public int? PageSize { get; set; }
        public string? SortField { get; set; }
        public string? SortDirection { get; set; }
        public string? Category { get; set; }
        public int? MinPoints { get; set; }
        public int? MaxPoints { get; set; }
        public bool? Exchangeable { get; set; }
        public int? Size { get; set; }
        public int? Page { get; set; }
    }
}
