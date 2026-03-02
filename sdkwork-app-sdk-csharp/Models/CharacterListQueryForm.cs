using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CharacterListQueryForm
    {
        public string? Style { get; set; }
        public string? Keyword { get; set; }
        public int? PageNum { get; set; }
        public int? PageSize { get; set; }
        public string? SortBy { get; set; }
        public string? SortOrder { get; set; }
    }
}
