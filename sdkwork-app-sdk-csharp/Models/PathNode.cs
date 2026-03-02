using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PathNode
    {
        public int? Id { get; set; }
        public string? Name { get; set; }
        public string? Code { get; set; }
        public int? Level { get; set; }
        public bool? IsCurrent { get; set; }
    }
}
