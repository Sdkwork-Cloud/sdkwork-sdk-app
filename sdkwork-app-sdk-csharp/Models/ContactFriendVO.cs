using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ContactFriendVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Username { get; set; }
        public string? Nickname { get; set; }
        public string? Name { get; set; }
        public string? Avatar { get; set; }
        public string? Status { get; set; }
        public bool? IsOnline { get; set; }
        public string? Remark { get; set; }
        public string? Signature { get; set; }
        public string? Region { get; set; }
        public string? Initial { get; set; }
    }
}
