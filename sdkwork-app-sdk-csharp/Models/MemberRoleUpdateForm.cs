using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MemberRoleUpdateForm
    {
        public string? WorkspaceId { get; set; }
        public string? MemberId { get; set; }
        public string? UserId { get; set; }
        public string? NewRoleId { get; set; }
        public string? NewRoleName { get; set; }
        public List<string>? Permissions { get; set; }
        public string? UpdateReason { get; set; }
        public bool? NeedNotify { get; set; }
    }
}
