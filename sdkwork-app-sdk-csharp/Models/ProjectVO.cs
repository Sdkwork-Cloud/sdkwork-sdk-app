using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProjectVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ProjectId { get; set; }
        public string? ProjectName { get; set; }
        public string? ProjectDescription { get; set; }
        public string? ProjectType { get; set; }
        public string? ProjectIcon { get; set; }
        public string? ProjectColor { get; set; }
        public List<string>? ProjectTags { get; set; }
        public string? WorkspaceId { get; set; }
        public string? WorkspaceName { get; set; }
        public string? CreatorId { get; set; }
        public string? CreatorName { get; set; }
        public string? CreateTime { get; set; }
        public string? UpdateTime { get; set; }
        public int? MemberCount { get; set; }
        public int? FileCount { get; set; }
        public string? Status { get; set; }
        public bool? IsPublic { get; set; }
        public List<string>? UserPermissions { get; set; }
    }
}
