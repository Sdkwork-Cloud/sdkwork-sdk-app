using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PositionVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Description { get; set; }
        public int? OwnerId { get; set; }
        public int? ParentId { get; set; }
        public int? Level { get; set; }
        public bool? IsActive { get; set; }
        public int? SortOrder { get; set; }
        public string? Category { get; set; }
        public string? LevelName { get; set; }
    }
}
