using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipPackVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public double? Price { get; set; }
        public double? OriginalPrice { get; set; }
        public int? PointAmount { get; set; }
        public int? VipDurationDays { get; set; }
        public string? LevelName { get; set; }
        public int? SortWeight { get; set; }
        public bool? Recommended { get; set; }
        public List<string>? Tags { get; set; }
    }
}
