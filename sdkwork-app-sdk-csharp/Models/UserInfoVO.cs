using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserInfoVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Username { get; set; }
        public string? Email { get; set; }
        public string? Phone { get; set; }
        public string? Nickname { get; set; }
        public string? Avatar { get; set; }
        public string? Role { get; set; }
        public string? Status { get; set; }
    }
}
