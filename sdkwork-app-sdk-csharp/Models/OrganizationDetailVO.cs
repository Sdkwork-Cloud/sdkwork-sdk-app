using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OrganizationDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Status { get; set; }
        public string? Description { get; set; }
        public int? ParentId { get; set; }
        public string? ContactPerson { get; set; }
        public string? ContactPhone { get; set; }
        public string? ContactEmail { get; set; }
        public string? Address { get; set; }
        public string? Website { get; set; }
        public string? LogoUrl { get; set; }
        public OrganizationMetadata? Metadata { get; set; }
        public InstallAppList? InstallAppList { get; set; }
        public int? MemberCount { get; set; }
        public int? DepartmentCount { get; set; }
        public int? PositionCount { get; set; }
    }
}
