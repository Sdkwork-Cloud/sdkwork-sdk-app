using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipLevelVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Name { get; set; }
        public int? LevelValue { get; set; }
        public int? RequiredPoints { get; set; }
        public string? Description { get; set; }
        public string? Icon { get; set; }
        public string? Badge { get; set; }
    }
}
