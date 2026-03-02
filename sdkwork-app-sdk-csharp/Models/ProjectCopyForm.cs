using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProjectCopyForm
    {
        public string? SourceProjectId { get; set; }
        public string? TargetWorkspaceId { get; set; }
        public string? NewName { get; set; }
        public string? NewProjectDescription { get; set; }
        public bool? CopyMembers { get; set; }
        public bool? CopyFiles { get; set; }
        public bool? CopySettings { get; set; }
        public string? CopyReason { get; set; }
    }
}
