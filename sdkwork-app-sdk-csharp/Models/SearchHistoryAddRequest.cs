using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SearchHistoryAddRequest
    {
        public string? Keyword { get; set; }
    }
}
