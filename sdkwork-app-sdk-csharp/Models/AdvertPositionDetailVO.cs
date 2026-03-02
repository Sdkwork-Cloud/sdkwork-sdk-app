using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AdvertPositionDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? PositionId { get; set; }
        public string? PositionName { get; set; }
        public string? PositionType { get; set; }
        public string? Description { get; set; }
        public int? Priority { get; set; }
        public bool? Enabled { get; set; }
        public List<AdvertVO>? Adverts { get; set; }
    }
}
