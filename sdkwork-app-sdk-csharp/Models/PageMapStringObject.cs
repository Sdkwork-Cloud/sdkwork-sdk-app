using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PageMapStringObject
    {
        public int? TotalPages { get; set; }
        public int? TotalElements { get; set; }
        public int? Size { get; set; }
        public List<Dictionary<string, object>>? Content { get; set; }
        public int? Number { get; set; }
        public SortObject? Sort { get; set; }
        public bool? First { get; set; }
        public bool? Last { get; set; }
        public int? NumberOfElements { get; set; }
        public PageableObject? Pageable { get; set; }
        public bool? Empty { get; set; }
    }
}
