using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SearchHistoryVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Keyword { get; set; }
        public string? SearchTime { get; set; }
        public int? Count { get; set; }
    }
}
