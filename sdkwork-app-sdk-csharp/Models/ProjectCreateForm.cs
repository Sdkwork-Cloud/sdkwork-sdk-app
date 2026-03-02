using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProjectCreateForm
    {
        public string? WorkspaceId { get; set; }
        public string? ProjectName { get; set; }
        public string? ProjectDescription { get; set; }
        public string? ProjectType { get; set; }
        public string? ProjectIcon { get; set; }
        public string? ProjectColor { get; set; }
        public List<string>? ProjectTags { get; set; }
        public List<ProjectMember>? Members { get; set; }
        public ProjectSettings? Settings { get; set; }
    }
}
