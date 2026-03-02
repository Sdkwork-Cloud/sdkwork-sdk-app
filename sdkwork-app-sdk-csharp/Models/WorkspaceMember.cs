using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class WorkspaceMember
    {
        public string? UserId { get; set; }
        public string? RoleId { get; set; }
        public string? RoleName { get; set; }
        public List<string>? Permissions { get; set; }
    }
}
