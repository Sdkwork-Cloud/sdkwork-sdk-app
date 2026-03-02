using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserSearchResult
    {
        public int? Id { get; set; }
        public string? Username { get; set; }
        public string? RealName { get; set; }
        public string? UserType { get; set; }
        public string? AvatarUrl { get; set; }
    }
}
