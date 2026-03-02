using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class HotSearchVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Keyword { get; set; }
        public int? Count { get; set; }
        public int? Rank { get; set; }
    }
}
