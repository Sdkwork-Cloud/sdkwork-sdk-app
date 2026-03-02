using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserSearchRequest
    {
        public string? Keyword { get; set; }
        public string? UserType { get; set; }
        public string? SortField { get; set; }
        public string? SortDirection { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
    }
}
