using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProjectDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ProjectId { get; set; }
        public string? ProjectName { get; set; }
        public string? ProjectTitle { get; set; }
        public string? ProjectDescription { get; set; }
        public string? ProjectType { get; set; }
        public string? ProjectTypeName { get; set; }
        public string? ProjectCode { get; set; }
        public string? ProjectIcon { get; set; }
        public string? CoverImageUrl { get; set; }
        public List<string>? ProjectTags { get; set; }
        public string? WorkspaceId { get; set; }
        public string? WorkspaceName { get; set; }
        public string? CreatorId { get; set; }
        public string? CreatorName { get; set; }
        public string? Author { get; set; }
        public string? SitePath { get; set; }
        public string? DomainPrefix { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public bool? IsTemplate { get; set; }
        public string? CreateTime { get; set; }
        public string? UpdateTime { get; set; }
        public List<MemberVO>? Members { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public ProjectSettings? Settings { get; set; }
    }
}
