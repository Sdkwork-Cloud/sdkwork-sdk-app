using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MemberVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? MemberId { get; set; }
        public string? UserId { get; set; }
        public string? Username { get; set; }
        public string? Nickname { get; set; }
        public string? Avatar { get; set; }
        public string? Email { get; set; }
        public string? RoleId { get; set; }
        public string? RoleName { get; set; }
        public List<string>? Permissions { get; set; }
        public string? JoinTime { get; set; }
        public string? LastActiveTime { get; set; }
        public string? Status { get; set; }
        public bool? IsCreator { get; set; }
        public bool? IsAdmin { get; set; }
    }
}
