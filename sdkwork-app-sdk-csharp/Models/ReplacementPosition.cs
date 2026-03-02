using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ReplacementPosition
    {
        public int? Start { get; set; }
        public int? End { get; set; }
        public string? Original { get; set; }
        public string? Replacement { get; set; }
    }
}
