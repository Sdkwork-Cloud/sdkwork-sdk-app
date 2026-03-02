using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ProjectMoveForm
    {
        public string? ProjectId { get; set; }
        public string? TargetWorkspaceId { get; set; }
        public string? MoveReason { get; set; }
        public bool? RetainMembers { get; set; }
        public bool? RetainSettings { get; set; }
    }
}
