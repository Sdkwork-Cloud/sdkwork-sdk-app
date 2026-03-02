using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PositionCreateForm
    {
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Description { get; set; }
        public int? OwnerId { get; set; }
        public int? ParentId { get; set; }
        public int? Level { get; set; }
        public int? SortOrder { get; set; }
        public string? Category { get; set; }
        public int? RequiredExperienceYears { get; set; }
        public string? RequiredEducation { get; set; }
        public int? MaxMemberCount { get; set; }
    }
}
