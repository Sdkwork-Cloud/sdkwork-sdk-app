using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OrganizationStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalOrganizations { get; set; }
        public int? ActiveOrganizations { get; set; }
        public int? TotalMembers { get; set; }
        public int? TotalDepartments { get; set; }
        public int? TotalPositions { get; set; }
    }
}
