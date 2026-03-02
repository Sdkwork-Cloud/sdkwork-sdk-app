using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FollowQueryForm
    {
        public int? Page { get; set; }
        public int? Size { get; set; }
        public string? QueryType { get; set; }
        public string? UserId { get; set; }
        public string? Keyword { get; set; }
    }
}
