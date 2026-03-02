using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MemberInviteForm
    {
        public string? WorkspaceId { get; set; }
        public List<string>? Emails { get; set; }
        public string? RoleId { get; set; }
        public string? RoleName { get; set; }
        public List<string>? Permissions { get; set; }
        public string? InviteMessage { get; set; }
        public int? ExpireHours { get; set; }
        public bool? NeedApproval { get; set; }
    }
}
