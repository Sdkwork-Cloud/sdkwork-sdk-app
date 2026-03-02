using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class WorkspaceVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? WorkspaceId { get; set; }
        public string? WorkspaceName { get; set; }
        public string? WorkspaceDescription { get; set; }
        public string? WorkspaceIcon { get; set; }
        public string? WorkspaceColor { get; set; }
        public string? WorkspaceType { get; set; }
        public string? CreatorId { get; set; }
        public string? CreatorName { get; set; }
        public string? CreateTime { get; set; }
        public string? UpdateTime { get; set; }
        public int? MemberCount { get; set; }
        public int? ProjectCount { get; set; }
        public string? Status { get; set; }
        public bool? IsPublic { get; set; }
        public string? UserRole { get; set; }
        public List<string>? UserPermissions { get; set; }
        public WorkspaceSettings? Settings { get; set; }
    }
}
